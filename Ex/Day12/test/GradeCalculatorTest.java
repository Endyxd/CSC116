import org.junit.Test;
import junit.framework.TestCase;

/**
 * Program to test GradeCalculator methods
 * @author
 */
public class GradeCalculatorTest extends TestCase {
 
    @Test
    public void testIsValidAverage1() {
        
        assertTrue("GradeCalculator.isValidAverage(78)", GradeCalculator.isValidAverage(78));
        
    }

    @Test
    public void testIsValidAverage2() {
        
        assertFalse("GradeCalculator.isValidAverage(104)", GradeCalculator.isValidAverage(104));
 
    }

    // Add 3 more JUnit test cases for the isValidAverage method

    @Test
    public void testCalculateGrade1() {
        // Example valid test case for calculateGrade method
        assertEquals("GradeCalculator(95)", "A", GradeCalculator.calculateGrade(95));
        
    }

    @Test
    public void testCalculateGrade2() {
        
        assertEquals("GradeCalculator(65)", "D", GradeCalculator.calculateGrade(65));
         
    }

    // Add 7 more *valid* JUnit test cases here for calculateGrade method
    
    @Test
    public void testCalculateGradeInvalid() {
        // Invalid test cases are provided for you below - You do NOT
        // need to add additional invalid tests. Just make sure these
        // pass!
        try {
            GradeCalculator.calculateGrade(103);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid average", e.getMessage());
        }

        try {
            GradeCalculator.calculateGrade(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid average", e.getMessage());
        }
            
    }
}
