    import java.util.Arrays;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Program to test MovieSelector methods
 * @author Suzanne Balik
 *@author Nicholas Loftin
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
    /** The room Information */
    public static final Movie THE_ROOM = new Movie("The Room", 2003, 99,
        "Comedy,Drama,Romance");
    /** It 2017 information */
    public static final Movie IT = new Movie("It", 2017, 146,
        "Drama,Mystery");
    /** Shaun of the Dead info */
    public static final Movie SHAUN_OF_THE_DEAD = new Movie("Shaun of the Dead", 2004, 100,
        "Comedy,Doomsday,Parody,Adventure");
    /** Scott Pilgrim info */
    public static final Movie SCOTT_PILGRIM_VS_THE_WORLD = new Movie("Scott Pilgrim vs. The World", 2010, 113, 
        "Comedy,Fantasy,Romance,Action");
    
    /** Disney movie array */
    public static final Movie[] THREE_MOVIES = { SLEEPING_BEAUTY, SNOW_WHITE, PINOCCHIO };
    
    /** My movie array */
    public static final Movie[] MY_MOVIES = { THE_ROOM, IT, SHAUN_OF_THE_DEAD, SCOTT_PILGRIM_VS_THE_WORLD };
    
    
    
    @Test
    public void testGetMovieList1() {
        String filename = "test-files/three_movies.txt";
        Movie[] actual = MovieSelector.getMovieList(filename);
        assertTrue(filename, Arrays.equals(THREE_MOVIES, actual));
    }

    // TODO: Add 1 more test case here for getMovieList method. The test should be
    // in its own method.
    
    @Test
    public void testGetMovieList2(){
        String filename = "test-files/my_movies.txt";
        Movie[] actual = MovieSelector.getMovieList(filename);
        assertTrue(filename, Arrays.equals(MY_MOVIES, actual));
    }


    @Test
    public void testSearchByTitle1() {
        String expected = "Snow White and the Seven Dwarfs          1937   83 min  " + 
                          "Animation,Family,Fantasy\n";
        String actual = MovieSelector.searchByTitle("and the", THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }
    
    @Test
    public void testSearchByTitle2(){
        String expected = "Shaun of the Dead    2004    100 min " +
                            "Comedy,Doomsday,Parody,Adventure\n";
        String actual = MovieSelector.searchByTitle("Shaun", MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }
    
    @Test
    public void testSearchByTitle3(){
        String expected = "Scott Pilgrim vs. The World  2010    113 min " +
                            "Comedy,Fantasy,Romance,Action\n";
        String actual = MovieSelector.searchByTitle("vs.", MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }



    @Test
    public void testSearchByYear1() {
        String expected = "The Adventures of Pinocchio              1936   60 min  " +
                          "Animation,Fantasy\n";
        String actual = MovieSelector.searchByYear(1936, THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }

    @Test
    public void testSearchByYear2(){
        String expected = "The Room 2003   99 min   Comedy,Drama,Romance\n";
        String actual = MovieSelector.searchByYear(2003, MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }
    
    @Test
    public void testSearchByGenre() {
        String expected = "Sleeping Beauty                          1959   75 min  " +
                          "Animation,Family,Fantasy\n" +
                          "Snow White and the Seven Dwarfs          1937   83 min  " + 
                          "Animation,Family,Fantasy\n" +
                          "The Adventures of Pinocchio              1936   60 min  " +
                          "Animation,Fantasy\n";
        String actual = MovieSelector.searchByGenre("Fantasy", THREE_MOVIES);
        assertEquals("Three movies", expected, actual);
    }
    @Test
    public void testSearchByGenre2(){
        String expected = "The Room 2003    99 min  Comedy,Drama,Romance\n" +
                          "It   2017    146min  Drama,Mystery\n";
        String actual = MovieSelector.searchByGenre("Drama", MY_MOVIES);
        assertEquals("my movies", expected, actual);
    }

    // TODO: Add 1 more test case here for searchByGenre method. The test should be
    // in its own method.

    /**
     * Test the MovieSelector methods with invalid values
     */ 
    @Test
    public void testSearchInvalid() {
        // Invalid test cases are provided for you below - You do NOT
        // need to add additional invalid tests. Just make sure this test
        // passes!
        try {
            MovieSelector.searchByYear(-5, THREE_MOVIES);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid year", e.getMessage());
        }

    }
}
