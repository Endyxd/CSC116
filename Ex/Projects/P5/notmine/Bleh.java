
import java.io.*;
import java.util.*;

public class Bleh {

    public static final String[] GENRELIST = { "Action", "Adventure", "Animation", "Biography", "Comedy", "Crime",
            "Documentary", "Drama", "Family", "Fantasy", "History", "Horror", "Musical", "Mystery", "Romance", "Sci-Fi",
            "Sport", "Thriller", "War", "Western" };

    public static void main(String[] args) {

        Boolean ask = true;
        Movie[] movies = getMovieList("3movies.txt");

        while (ask) {
            System.out.println("Movie selector - Please enter an option below.");
            System.out.println("");
            System.out.println("");
            System.out.println("T - Search by title");
            System.out.println("Y - Search by year");
            System.out.println("G - Search by genre");
            System.out.println("Q - Quit the program");
            System.out.println("");
            System.out.printf("Option: ");

            Scanner user = new Scanner(System.in);
            String input = user.nextLine();
            String newInput = input.toLowerCase();
            if (newInput.equals("t") || newInput.equals("y") || newInput.equals("g") || newInput.equals("q")) {
                Scanner in = new Scanner(System.in);
                if (input.equals("t")) {
                    System.out.printf("Title (is/contains): ");
                    in = new Scanner(System.in);
                    String title = in.next();
                    String titleSearch = searchByTitle(title, movies);
                    System.out.printf(titleSearch);
                }
                if (input.equals("y")) {
                    System.out.printf("Year (1890-2020): ");
                    in = new Scanner(System.in);
                    int year = in.nextInt();
                    String yearSearch = searchByYear(year, movies);
                    System.out.printf(yearSearch);
                }

                if (input.equals("g")) {
                    System.out.printf("Genre Choices: " + GENRELIST);
                    System.out.println("");
                    System.out.println("Genre: ");
                    in = new Scanner(System.in);
                    String genre = in.next();
                    Boolean genreCheck = checkGenre(genre);
                    if (genreCheck == true) {
                        String genreSearch = searchByGenre(genre, movies);
                        System.out.printf(genreSearch);
                    }else{
                        System.out.println("Invalid Genre");
                    }
                }

                if (input.equals("q")) {
                    ask = false;
                    System.exit(1);
                }

            } else {
                System.out.println("Invalid input");
            }

            user.close();
        }
    }

    public static Boolean checkGenre(String inputGenre) {
        Boolean check = false;
        inputGenre += inputGenre.toLowerCase();

        for (int i = 0; i < GENRELIST.length; i++) {
            if (GENRELIST[i].contains(inputGenre)) {
                check = true;
            }
        }

        return check;
    }

    // - Create a Scanner for the given file and
    // - Read through the file once counting the number of lines (movies) - read,
    // but do not count the header line
    // - Create an array of Movie objects of the correct size
    // - Create another Scanner for the file and read through the file again reading
    // the information for each movie and storing it in the Movie array
    // Return the Movie array
    // If a FileNotFoundException occurs, throw an IllegalArgumentException with the
    // message, "Unable to access input file: <filename>", for example,
    // "Unable to access input file: test-files/junk.txt"
    // The IllegalArgumentException should be caught by the calling method --
    // see the Implementation section for how to do this
    public static Movie[] getMovieList(String filename) {

        Movie[] list = null;
        int count = 0;

        Scanner file;
        try {
            file = new Scanner(new File(filename));
            file.nextLine();

            do {
                file.nextLine();
                count++;
            } while (file.hasNextLine());
            file.close();

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Unable to access input file: ");
        }

        try {
            file = new Scanner(new File(filename));
            file.nextLine();
            list = new Movie[count];

            for (int i = 0; i < count; i++) {
                String line = file.nextLine();
                Scanner token = new Scanner(line);
                token.useDelimiter("\t");
                list[i] = new Movie(token.next(), token.nextInt(), token.nextInt(), token.next());
                token.close();
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Unable to access input file: ");
        }

        file.close();
        return list;

    }

    // Return a String with the title, year, length, and genre of each movie whose
    // title equals
    // or contains the given (parameter) title, disregarding case.
    // If none of the movies have a title that equals or contains the given title,
    // disregarding case,
    // an empty string is returned
    // HINT: Use the Movie toString() method which will provide the correct
    // formatting.
    public static String searchByTitle(String title, Movie[] movies) {

        String name = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getTitle().contains(title)) {
                name += movies[i].toString() + "\n";
            }
        }

        if (name.length() == 0) {
            return "NOT FOUND";
        }

        return name;
    }

    // Return a String with the title, year, length, and genre of each movie whose
    // year is equal
    // to the given (parameter) year
    // If none of the movies have a year equal to the given year, an empty string is
    // returned
    // Throw an IllegalArgumentException with the message "Invalid year" if year is
    // negative
    // HINT: Use the Movie toString() method which will provide the correct
    // formatting.
    public static String searchByYear(int year, Movie[] movies) {
        String releaseDate = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getYear() == year) {
                releaseDate = movies[i].toString();
            }
        }

        if (releaseDate.length() == 0) {
            return "NOT FOUND";
        }

        return releaseDate;
    }

    // Return a String with the title, year, length, and genre of each movie whose
    // genre field equals
    // or contains the given (parameter) genre, disregarding case.
    // If none of the movies have a genre that equals or contains the given genre,
    // disregarding case,
    // an empty string is returned
    // HINT: Use the Movie toString() method which will provide the correct
    // formatting.
    public static String searchByGenre(String genre, Movie[] movies) {

        String genreMovies = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getGenre().contains(genre)) {
                genreMovies = movies[i].toString();
            }
        }

        if (genreMovies.length() == 0) {
            System.out.println("NOT FOUND");
            return "NOT FOUND";
        }

        return genreMovies;

    }
}