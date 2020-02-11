    import org.junit.Before;
import org.junit.Test;
import java.awt.*;

import junit.framework.TestCase;

/**
 * Tests Symbol class
 * @author Suzanne Balik
 * @author 
 */
public class SymbolTest extends TestCase {

    /** Symbol giraffe for testing */
    private Symbol giraffe;

    // TODO: Add another Symbol field

    /**
     * Create Symbols for testing
     */
    @Before
    public void setUp() {
        giraffe = new Symbol("giraffe", 25);
        // TODO: Construct added Symbol
    }
    
    @Before
    public void setUp(){
        dawg = new Symbol("dawg", 50);
    }




    @Test
    public void testConstructorPreConditions() {
        try {
            new Symbol(null, 1);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Correct NullPointerException message", "Null name",
                    e.getMessage());
        }

        try {
            new Symbol("snake", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid points",
                    e.getMessage());
        }

        try {
            new Symbol("frog", -5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid points",
                    e.getMessage());
        }       

    }

    @Test
    public void testGetNameGiraffe() {
        assertEquals("giraffe name", "giraffe", giraffe.getName());
    }
    // TODO: Test getName for added Symbol. Test should be in its own method.

    
    @Test
    public void testGetNameDawg() {
        assertEquals("dawg name", "dawg", dawg.getName());
    }

    @Test
    public void testGetPointsGiraffe() {
        assertEquals("giraffe points", 25, giraffe.getPoints());
    }
    // TODO: Test getPoints for added Symbol. Test should be in its own method.
    
    @Test
    public void testGetPointsDawg() {
        assertEquals("dawg points", 50, dawg.getPoints());
    }
    // TODO: Test getPoints for added Symbol. Test should be in its own method.
    
    
    @Test
    public void testToStringGiraffe() {
        assertEquals("giraffe toString", "giraffe 25 false", giraffe.toString());
    }
    // TODO: Test toString for added Symbol. Test should be in its own method.

    @Test
    public void testToStringDawg() {
        assertEquals("dawg toString", "dawg 50 false", dawg.toString());
    }
    // TODO: Test toString for added Symbol. Test should be in its own method.

    @Test
    public void testHasBeenClickedOnGiraffe() {
        assertFalse("giraffe hasBeenClickedOn", giraffe.hasBeenClickedOn());
    }
    // TODO: Test hasBeenClickedOn for added Symbol. Test should be in its own method.
    
    @Test
    public void testHasBeenClickedOnDawg() {
        assertFalse("dawg hasBeenClickedOn", dawg.hasBeenClickedOn());
    }
    
    @Test
    public void testSetHasBeenClickedOnGiraffe() {
        giraffe.setHasBeenClickedOn(true);
        assertTrue("giraffe setHasBeenClickedOn true", giraffe.hasBeenClickedOn());
        giraffe.setHasBeenClickedOn(false);
        assertFalse("giraffe setHasBeenClickedOn false", giraffe.hasBeenClickedOn());
    }
    // TODO: Test setHasBeenClickedOn for added Symbol. Test should be in its own method.
    @Test
    public void testSetHasBeenClickedOnDawg() {
        dawg.setHasBeenClickedOn(true);
        assertTrue("dawg setHasBeenClickedOn true", dawg.hasBeenClickedOn());
        dawg.setHasBeenClickedOn(false);
        assertFalse("dawg setHasBeenClickedOn false", dawg.hasBeenClickedOn());
    }
    @Test
    public void testSetHasBeenClickedOnGiraffe2() {
        cat.setHasBeenClickedOn(true);
        assertTrue("giraffe setHasBeenClickedOn true", giraffe.hasBeenClickedOn());
        giraffe.setHasBeenClickedOn(false);
        assertFalse("giraffe setHasBeenClickedOn false", giraffe.hasBeenClickedOn());
    }
    


    @Test
    public void testEqualsGiraffe() {
        assertTrue("giraffe equals with same instance", giraffe.equals(giraffe));
        assertTrue("giraffe equals with different instances", 
                   giraffe.equals(new Symbol("giraffe", 25)));
        assertFalse("giraffe with different name", giraffe.equals(new Symbol("cow", 25)));
        assertFalse("giraffe with different points", giraffe.equals(new Symbol("giraffe", 4)));
        assertFalse("giraffe with different name and points", 
                    giraffe.equals(new Symbol("horse", 5)));
        assertFalse("giraffe compared to null object", giraffe.equals(null));
        assertFalse("giraffe compared to String", giraffe.equals("giraffe"));
    }
    // TODO: Test equals for added Symbol. Test should be in its own method.

    @Test
    public void testEqualsDawg() {
        assertTrue("dawg equals with same instance", dawg.equals(dawg));
        assertTrue("dawg equals with different instances", 
                   dawg.equals(new Symbol("dawg", 50)));
        assertFalse("dawg with different name", dawg.equals(new Symbol("cow", 50)));
        assertFalse("dawg with different points", dawg.equals(new Symbol("dawg", 4)));
        assertFalse("dawg with different name and points", 
                    dawg.equals(new Symbol("horse", 5)));
        assertFalse("dawg compared to null object", dawg.equals(null));
        assertFalse("dawg compared to String", dawg.equals("dawg"));
    }
}
