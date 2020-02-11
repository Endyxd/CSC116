/**
 * Encapsulates information about a movie
 * @author Suzanne Balik
 */
public class Movie {

    /** Title of movie */
    private String title;
    
    /** Movie year */ 
    private int year;
  
    /** Movie length */
    private int length;

    /** Movie genre(s) */
    private String genre;
      
    /**
     * Constructs and initializes a Movie object.
     * @param title title of movie
     * @param year movie year
     * @param length movie length
     * @param genre movie genre(s) 
     * @throws IllegalArgumentException if title is null
     * @throws IllegalArgumentException if genre is null
     * @throws IllegalArgumentException if year or length is nonpositive
     */
    public Movie (String title, int year, int length, String genre) {
        if (title == null) {
            throw new IllegalArgumentException("title is null");
        }
        if (genre == null) {
            throw new IllegalArgumentException("genre is null");
        }
        if (year <= 0 || length <= 0) {
            throw new IllegalArgumentException("year or length is nonpositive");
        }
        this.title = title;
        this.year = year;
        this.length = length;
        this.genre = genre;
    }
    
    /**
     * Returns the title
     * @return title
     */
    public String getTitle() {
        return title;
    } 
   
    /**
     * Returns the year
     * @return year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Returns the length
     * @return length
     */
    public int getLength() {
        return length;
    }

    /**
     * Returns the genre
     * @return genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Determines if the given Movie object has the same 
     * state as this Movie object
     *
     * @param object Movie object to compare 
     * @return true   if given Movie object equals this Movie object
     *         false  otherwise
     */
    public boolean equals(Object object) {
        if (object instanceof Movie) {
            Movie other = (Movie) object;
            return title.equals(other.title) && year == other.year && length == other.length &&
                   genre.equals(other.genre);
        } else {
            return false;
        }
    }


    /**
     * Returns a String representation of the Movie object
     * @return String containing title, year, length, and genre(s)
     */
    public String toString() {
        return String.format("%-40s%5d%5d min  %s", title, year, length, genre); 
    }
               
}
