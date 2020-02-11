import java.util.*;
import java.io.*;
public class MovieSelector {
    //Create a Scanner for the given file and read through the file 
    //once counting the number of lines (movies) - read, but do not count the header line
    //Create an array of Movie objects of the correct size
    //Create another Scanner for the file and read through the file again
    //reading the information for each movie and storing it in the Movie array
    //Return the Movie array
    //If a FileNotFoundException occurs, throw an IllegalArgumentException
    //with the message, "Unable to access input file: <filename>", for example,
    //"Unable to access input file: test-files/junk.txt"
    //The IllegalArgumentException should be caught by the calling method --
    //see the Implementation section for how to do this
    public static Movie[] getMovieList(String filename) {
        int movieNum = 0;
        Scanner inCheck;
        Movie[] MovieList = null;
        try {
            inCheck = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Unable to access input file: " + filename);
        }
        inCheck.nextLine();
        do {
            movieNum++;
            inCheck.nextLine();
        } while (inCheck.hasNextLine());
        try {
            Scanner inFile = new Scanner(new File(filename));
            inFile.nextLine();
            MovieList = new Movie[movieNum];
            for (int i = 0; i < movieNum; i++) {
                String line = inFile.nextLine();
                Scanner tokenFinder = new Scanner(line);
                tokenFinder.useDelimiter("\t");
                MovieList[i] = new Movie(tokenFinder.next(), tokenFinder.nextInt(), tokenFinder.nextInt(), tokenFinder.next());
            }

        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Unable to access input file: " + filename);
        }
        return MovieList;

    }

    public static String searchByTitle(String title, Movie[] movies) {
        String name = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getTitle().contains(title)) {
                name += movies[i].toString() + "\n";
            }
        }

        if (name.length() == 0) {
            return "";
        }
        return name;
    }

    public static String searchByYear(int year, Movie[] movies) {
        String name = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getYear() == year) {
                name += movies[i].toString() + "\n";
            }
        }

        if (name.length() == 0) {
            return "";
        }
        return name;
    }

    public static String searchByGenre(String genre, Movie[] movies) {
        String name = "";

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getGenre().contains(genre)) {
                name += movies[i].toString() + "\n";
            }
        }

        if (name.length() == 0) {
            return "";
        }
        return name;
    }

    public static void main(String[] args) {
        Movie movies[] = getMovieList("movies.txt");
        do {
            String input = "";
            System.out.println("Movie selector - Please enter an option below.");
            System.out.println("");
            System.out.println("T - Search by title");
            System.out.println("Y - Search by year");
            System.out.println("G - Search by genre");
            System.out.println("Q - Quit the program");
            System.out.println("");
            System.out.printf("Pick one: ");

            Scanner in = new Scanner(System.in);
            input = in .next();
            input = input.toLowerCase();

            if (input.equals("t") || input.equals("y") || input.equals("g") || input.equals("q")) {
                if (input.equals("t")) {
                    System.out.print("Title keyword: ");
                    Scanner inTitle = new Scanner(System.in);
                    String title = inTitle.next();
                    String titleSearch = searchByTitle(title, movies);
                    System.out.print(titleSearch);
                }
                if (input.equals("y")) {
                    System.out.print("Search year: ");
                    Scanner inYear = new Scanner(System.in);
                    int year = inYear.nextInt();
                    String yearSearch = searchByYear(year, movies);
                    System.out.print(yearSearch);
                }
                if (input.equals("g")) {
                    System.out.print("Search genre: ");
                    Scanner inGenre = new Scanner(System.in);
                    String genre = inGenre.next();
                    String genreSearch = searchByGenre(genre, movies);
                    System.out.print(genreSearch);
                }
                if (input.equals("q")) {
                    System.out.println("Have a good one :3");
                    System.exit(1);
                }
            } else {
                System.out.println("Invalid input");
            }
        } while (1 == 1);
    }
}