import java.util.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Tests WhackaMole class
 * @author Suzanne Balik
 * @author
 */
public class WhackaMoleTest extends TestCase {
    
   
    /** WhackaMole instance used for testing */
    private WhackaMole whackaMole;
    
    private WhackaMole wha;

    /**
     * Create new WhackaMole instance for testing
     */
    @Before
    public void setUp() {
        whackaMole = new WhackaMole(true);
    }
    @Before
    public void setUp2(){
        wha = new WhackaMole(true);
    }

    @Test
    public void testConstants() {
        // The following test tests that required constants are defined as specified
        assertEquals("ROWS", 5, WhackaMole.ROWS);
        assertEquals("COLS", 5, WhackaMole.COLS);
        String[][] symbolNames = {{"cat", "dog", "tiger", "frog", "cat"}, 
                                  {"tiger", "lion", "dog", "tiger", "frog"},
                                  {"cat", "frog", "mole",  "dog", "lion"},
                                  {"lion", "dog", "tiger", "cat", "frog"},
                                  {"cat", "frog", "lion", "dog", "tiger"}};
        assertTrue("SYMBOL_NAMES", Arrays.deepEquals(symbolNames,WhackaMole.SYMBOL_NAMES));
        int[][] symbolPoints = {{10, 15, 30, 20, 10},
                                {30, 40, 15, 30, 20},
                                {10, 20, 50, 15, 40},
                                {40, 15, 30, 10, 20},
                                {10, 20, 40, 15, 30}};
        assertTrue("SYMBOL_POINTS", Arrays.deepEquals(symbolPoints,WhackaMole.SYMBOL_POINTS));
    }

    @Test
    public void testConstructor() {

        assertEquals("Initial total score", 0, whackaMole.getTotalScore());
        assertEquals("Initial number of misses", 0, whackaMole.getNumberOfMisses());
        assertEquals("Initial next row", 0, whackaMole.getNextRow());
        assertEquals("Initial next col", 0, whackaMole.getNextCol());
        assertEquals("Correct symbol at 0 0", "cat", whackaMole.getSymbolName(0,0));
        assertEquals("Correct symbol at 2 2", "mole", whackaMole.getSymbolName(2,2));
        assertFalse("Not clicked on at 2 4", whackaMole.hasBeenClickedOn(2, 4));
    }

    @Test
    public void testgetSymbolNamePreConditions() {
        
        try {
            whackaMole.getSymbolName(-2, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            whackaMole.getSymbolName(3, 5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }

    @Test
    public void testGetSymbolPointsPreConditions() {
        
        try {
            whackaMole.getSymbolPoints(-1, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            whackaMole.getSymbolPoints(1, 7);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }

    @Test
    public void testHasBeenClickedOnPreConditions() {
        
        try {
            whackaMole.hasBeenClickedOn(-3, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            whackaMole.hasBeenClickedOn(3, 15);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }

    @Test
    public void testClickOnSymbolPreConditions() {
        
        try {
            whackaMole.clickOnSymbol(-3, 2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid row",
                    e.getMessage());
        }

        try {
            whackaMole.clickOnSymbol(3, 15);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Correct IllegalArgumentException message", "Invalid col",
                    e.getMessage());
        }
    }


    @Test
    public void testGrid() {
        Grid grid = whackaMole.getGrid();
        String exp = "cat dog tiger frog cat\n" +
                     "tiger lion dog tiger frog\n" +
                     "cat frog mole dog lion\n" +
                     "lion dog tiger cat frog\n" +
                     "cat frog lion dog tiger\n";
        assertEquals("Grid is correct", exp, grid.toString());
    }

    @Test
    public void testClickOnSymbolAndUpdateNextRowAndCol() {
        whackaMole.clickOnSymbol(0,0);
        assertTrue("Click on one symbol has been clicked on", whackaMole.hasBeenClickedOn(0,0));
        assertEquals("Click on one symbol total score", 10, whackaMole.getTotalScore());
        assertEquals("Click on one symbol next row", 0, whackaMole.getNextRow());
        assertEquals("Click on one symbol next col", 1, whackaMole.getNextCol()); 
    }

    @Test
    public void testAddMissAndUpdateNextRowAndCol() {
        whackaMole.addMiss();
        assertEquals("Click on one symbol total score", 1, whackaMole.getNumberOfMisses());
        assertEquals("Click on one symbol next row", 0, whackaMole.getNextRow());
        assertEquals("Click on one symbol next col", 1, whackaMole.getNextCol()); 
    }

    @Test
    public void testIsGameOver() {
        assertFalse("Is Game Over no clicks", whackaMole.isGameOver());
        for (int i = 0; i < 5; i++) {
            assertFalse("Is Game Over some clicks", whackaMole.isGameOver());
            for (int j = 0; j < 5; j++) {
                whackaMole.clickOnSymbol(i,j);
            }
        }
        assertTrue("Is Game Over all clicks", whackaMole.isGameOver());
        assertEquals("Is Game Over total score", 585, whackaMole.getTotalScore());
        assertEquals("Is Game Over no misses", 0, whackaMole.getNumberOfMisses());
    }
    

    @Test
    public void testPlayWhackaMole1() {
        whackaMole.clickOnSymbol(0,0);
        whackaMole.addMiss();
        whackaMole.clickOnSymbol(0,2);
        whackaMole.addMiss();
        whackaMole.clickOnSymbol(0,4);
        assertEquals("Play WhackaMole 1 total score", 50, whackaMole.getTotalScore());
        assertEquals("Play WhackaMole 1 number of misses", 2, whackaMole.getNumberOfMisses());
    }

    // TODO: Add 5 tests: 
    // test game play with no misses
    @Test
    public void noMisses(){
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                wha.clickOnSymbol(i, j);
            }
        } 
        assertEquals("Play WhackaMole 1 total score", 585, whackaMole.getTotalScore());
        assertEquals("Play WhackaMole 1 number of misses", 0, whackaMole.getNumberOfMisses());
    }
    // test game play with all misses
    // test game play your choice
    // test game play your choice
    // test game play your choice
    // Each test should be in its own method and 
    // call clickOnSymbol() and/or addMiss() at least 5 times

}
