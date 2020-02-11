import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Tests Grid class
 * @author Suzanne Balik
 */
public class GridTest extends TestCase {
    
    /** Grid for testing */
    private Grid grid;

    /**
     * Creates Grid for testing
     */
    @Before
    public void setUp() {
        grid = new Grid(2, 3);
    }


    @Test
    public void testConstructorPreConditions() {
 
        try {
            new Grid(0, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid rows/cols",
                    e.getMessage());
        }

        try {
            new Grid(3, -4);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid rows/cols",
                    e.getMessage());
        }      
    }

    @Test
    public void testSetSymbolPreConditions() {
        try {
            grid.setSymbol(1, 1, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Correct NullPointerException message", "Null symbol",
                    e.getMessage());
        }

        try {
            grid.setSymbol(5, 1, new Symbol("monkey", 20));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            grid.setSymbol(0, -1, new Symbol("elephant", 45));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }



    @Test
    public void testGetSymbolPreConditions() {
        
        try {
            grid.getSymbol(5, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            grid.getSymbol(0, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }

    @Test
    public void testSetAndGetSymbol() {
        grid.setSymbol(0, 2, new Symbol("horse", 8));
        assertEquals("Symbol ", new Symbol("horse", 8), grid.getSymbol(0, 2));
    }


    @Test
    public void testToString() {
        grid.setSymbol(0, 0, new Symbol("ant", 10));
        grid.setSymbol(0, 1, new Symbol("bat", 20));
        grid.setSymbol(0, 2, new Symbol("cat", 30));
        grid.setSymbol(1, 0, new Symbol("dog", 40));
        grid.setSymbol(1, 1, new Symbol("elephant", 50));
        grid.setSymbol(1, 2, new Symbol("frog", 60));
        String expected = "ant bat cat\ndog elephant frog\n";
        assertEquals("toString  after constructed",
                     expected, grid.toString());
    }
}
