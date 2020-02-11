import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Program to test MovieSelector methods
 * @author Suzanne Balik
 * @author Ifeoluwa Aderemi
 */
public class MovieSelectorTest extends TestCase {

    /** Sleeping Beauty Movie Information */
    public static final Movie SLEEPING_BEAUTY = new Movie("Sleeping Beauty", 1959, 75, 
        "Animation,Family,Fantasy" );
    /** Snow White Movie Information */
    public static final Movie SNOW_WHITE = new Movie("Snow White and the Seven Dwarfs", 1937, 83,
        "Animation,Family,Fantasy");    
    /** Pinocchio Movie Information */
    public static final Movie PINOCCHIO = new Movie("The Adventures of Pinocchio", 1936, 60,
        "Animation,Fantasy");
    /** The Avengers Movie Information */                                              
    public static final Movie THE_AVENGERS = new Movie("The Avengers", 2012, 143, 
        "Action,Adventure,Sci-Fi,Fiction");
    /** Age of Ultron Movie Information */
    public static final Movie AGE_OF_ULTRON = new Movie("Avengers: Age of Ultron", 2015, 142, 
        "Action,Adventure,Sci-Fi,Fantasy");
    /** Infinity War Movie Information */
    public static final Movie INFINITY_WAR = new Movie("Avengers: Infinity War", 2018, 160, 
        "Action,Adventure,Sci-Fi,Fiction");
    /** Endgame Movie Information */
    public static final Movie ENDGAME = new Movie("Avengers: Endgame", 2019, 182, 
        "Action,Adventure,Sci-Fi,Fantasy");
    
    
    /** Disney movie array */
    public static final Movie[] THREE_MOVIES = { SLEEPING_BEAUTY, SNOW_WHITE, PINOCCHIO };
    /** Disney's Avengers movie array */
    public static final Movie[] MY_MOVIES = { THE_AVENGERS, AGE_OF_ULTRON, INFINITY_WAR, ENDGAME };
    
   /**
    * This test passes if THREE_MOVIES is equal to actual, and fails otherwise.
    */
    @Test
    public void testGetMovieList1() {
        String filename = "test-files/three_movies.txt";
        Movie[] actual = MovieSelector.getMovieList(filename);
        assertTrue(filename, Arrays.equals(THREE_MOVIES, actual));
    }
    
   /**
    * This test passes if MY_MOVIES is equal to actual, and fails otherwise.
    */
    @Test
    public void testGetMovieList2() {
        String filename = "test-files/my_movies.txt";
        Movie[] actual = MovieSelector.getMovieList(filename);
        assertTrue(filename, Arrays.equals(MY_MOVIES, actual));
    }
        
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByTitle1() {
        String expected = "Snow White and the Seven Dwarfs          1937   83 min  " + 
                          "Animation,Family,Fantasy\n";
        String actual = MovieSelector.searchByTitle("and the", THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }
    
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByTitle2() {
        String expected = "";
        String actual = MovieSelector.searchByTitle("Bendy and the ink machine", MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }
    
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByTitle3() {
        String expected =  "The Avengers                             2012  143 min  " + 
                           "Action,Adventure,Sci-Fi,Fiction\n" +
                           "Avengers: Age of Ultron                  2015  142 min  " +
                           "Action,Adventure,Sci-Fi,Fantasy\n" +
                           "Avengers: Infinity War                   2018  160 min  " + 
                           "Action,Adventure,Sci-Fi,Fiction\n" +
                           "Avengers: Endgame                        2019  182 min  " + 
                           "Action,Adventure,Sci-Fi,Fantasy\n";
        String actual = MovieSelector.searchByTitle("Avengers", MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }
    
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByYear1() {
        String expected = "The Adventures of Pinocchio              1936   60 min  " +
                          "Animation,Fantasy\n";
        String actual = MovieSelector.searchByYear(1936, THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }
    
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByYear2() {
        String expected = "Avengers: Endgame                        2019  182 min  " + 
                          "Action,Adventure,Sci-Fi,Fantasy\n";
        String actual = MovieSelector.searchByYear(2019, MY_MOVIES);
        assertEquals("My movies", expected, actual);
    }
  
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByGenre1() {
        String expected = "Sleeping Beauty                          1959   75 min  " +
                          "Animation,Family,Fantasy\n" +
                          "Snow White and the Seven Dwarfs          1937   83 min  " + 
                          "Animation,Family,Fantasy\n" +
                          "The Adventures of Pinocchio              1936   60 min  " +
                          "Animation,Fantasy\n";
        String actual = MovieSelector.searchByGenre("Fantasy", THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }
    
   /**
    * This test passes if expected is equal to actual, and fails otherwise.
    */
    @Test
    public void testSearchByGenre2() {
        String expected = "The Avengers                             2012  143 min  " + 
                          "Action,Adventure,Sci-Fi,Fiction\n" +
                          "Avengers: Infinity War                   2018  160 min  " + 
                          "Action,Adventure,Sci-Fi,Fiction\n";
        
        String actual = MovieSelector.searchByGenre("Fiction", MY_MOVIES);
        assertEquals("My movies", expected, actual);
    }
    

    /**
     * Test the MovieSelector methods with invalid values
     */ 
    @Test
    public void testSearchInvalid() {
        try {
            MovieSelector.searchByYear(-5, THREE_MOVIES);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid year", e.getMessage());
        }
    }
}
