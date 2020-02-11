import org.junit.Test;
import junit.framework.TestCase;

/**
 * Program to test WolfpackLending methods
 * @author Suzanne Balik
 * @author 
 */
public class WolfpackLendingTest extends TestCase {
 
    public static final double DELTA = .01;
    
    @Test
    public void testIsValidDate1() {
        
        assertTrue("WolfpackLending.isValidDate(3, 20)", 
                   WolfpackLending.isValidDate(3, 20));
        
    }

    @Test
    public void testIsValidDate2() {
        
        assertFalse("WolfpackLending.isValidDate(13, 24)", 
                    WolfpackLending.isValidDate(13, 24));
    }

    // TODO: Add 5 more test cases here for the isValidDate method. Each test should be
    // in its own method
    
    //1
    @Test
    public void testIsValidDate3() {
        
        assertTrue("WolfpackLending.isValidDate(12, 31)", 
                    WolfpackLending.isValidDate(12, 20));
    }
    
    //2
    @Test
    public void testIsValidDate4() {
        
        assertFalse("WolfpackLending.isValidDate(1, 32)", 
                    WolfpackLending.isValidDate(1, 32));
    }
    
    //3
    @Test
    public void testIsValidDate5() {
        
        assertTrue("WolfpackLending.isValidDate(2, 15)", 
                    WolfpackLending.isValidDate(2, 15));
    }
    
    //4
    @Test
    public void testIsValidDate6() {
        
        assertFalse("WolfpackLending.isValidDate(2, 30)", 
                    WolfpackLending.isValidDate(2, 30));
    }
    
    //5
    @Test
    public void testIsValidDate7() {
        
        assertTrue("WolfpackLending.isValidDate(4, 20)", 
                    WolfpackLending.isValidDate(4, 20));
    }
    
    
    

    @Test
    public void testGetInterestRate1() {
        
        assertEquals("WolfpackLending.getInterestRate(2254, 755, 2000)", 5.5,
                     WolfpackLending.getInterestRate(2254, 755, 2000), DELTA);
        
    }

    @Test
    public void testGetInterestRate2() {
        
        assertEquals("WolfpackLending.getInterestRate(8967, 300, 0)", -1.0,
                     WolfpackLending.getInterestRate(8967, 300, 0), DELTA);
        
    }

    // TODO: Add 3 more valid test cases here for the getInterestRate method. Each test should be
    // in its own method
    
    //1
    public void testGetInterestRate3() {
        
        assertEquals("WolfpackLending.getInterestRate(1230, 600, 9400)", 6.0,
                     WolfpackLending.getInterestRate(1230, 600, 9400), DELTA);
        
    }
    
    //2
    public void testGetInterestRate4() {
        
        assertEquals("WolfpackLending.getInterestRate(4040, 550, 13200)", 6.5,
                     WolfpackLending.getInterestRate(4040, 550, 13200), DELTA);
        
    }
    
    //3
    public void testGetInterestRate5() {
        
        assertEquals("WolfpackLending.getInterestRate(7000, 700, 15000)", 7.5,
                     WolfpackLending.getInterestRate(7000, 700, 15000), DELTA);
        
    }
    

    @Test
    public void testGetMonthlyPayment1() {
        
        assertEquals("WolfpackLending.getMonthlyPayment(2502, 6.5, 30)", 90.58,
                     WolfpackLending.getMonthlyPayment(2502, 6.5, 30), DELTA);
        
    }

    @Test
    public void testGetMonthlyPayment2() {
        
        assertEquals("WolfpackLending.getMonthlyPayment(26890, 8.3, 60)", 549.10,
                     WolfpackLending.getMonthlyPayment(26890, 8.3, 60), DELTA);
        
    }

    // TODO: Add 3 more valid test cases here for the getMonthlyPayment method. Each test should be
    // in its own method
    
    //1
    @Test
    public void testGetMonthlyPayment3() {
        assertEquals("WolfpackLending.getMonthlyPayment(3000, 5.5, 70)", 50.19,
                    WolfpackLending.getMonthlyPayment(3000, 5.5, 70), DELTA);
    }
    
    //2
    @Test
    public void testGetMonthlyPayment4() {
        assertEquals("WolfpackLending.getMonthlyPayment(8059, 6.1, 40)", 223.16,
                    WolfpackLending.getMonthlyPayment(8059, 6.1, 40), DELTA);
    }
    
    //3
    @Test
    public void testGetMonthlyPayment5() {
        assertEquals("WolfpackLending.getMonthlyPayment(2502, 6.5, 30)", 90.58,
                    WolfpackLending.getMonthlyPayment(2502, 6.5, 30), DELTA);
    }
    
    
    
    

    @Test
    public void testGetDisbursementDate1() {
        
        assertEquals("WolfpackLending.getDisbursementDate(3, 16, true)", "Thu, 3 19 2020",
                   WolfpackLending.getDisbursementDate(3, 16, true));
        
    }

    @Test
    public void testGetDisbursementDate2() {
        
        assertEquals("WolfpackLending.getDisbursementDate(4, 30, false)", "Wed, 5 20 2020",
                   WolfpackLending.getDisbursementDate(4, 30, false));
        
    }

    // TODO: Add 6 more test cases here for the getDisbursementDate method. Each test should be
    // in its own method
    
    //1
    @Test
    public void testGetDisbursementDate44(){
        assertEquals("WolfpackLending.getDisbursementDate(12, 31, true)", "Sun, 1 3 2021",
                   WolfpackLending.getDisbursementDate(12, 31, true));
    }
    
    //2
    @Test
    public void testGetDisbursementDate4(){
        assertEquals("WolfpackLending.getDisbursementDate(5, 20, true)", "Sat, 5 23 2020",
                   WolfpackLending.getDisbursementDate(5, 20, true));
    }
    
    //3
    @Test
    public void testGetDisbursementDate5(){
        assertEquals("WolfpackLending.getDisbursementDate(6, 28, false)", "Sat, 7 18 2020",
                   WolfpackLending.getDisbursementDate(6,28,false));
    }
    
    //4
    @Test
    public void testGetDisbursmentDate6(){
        assertEquals("WolfpackLending.getDisbursementDate(8,30, true)", "Tue, 9 2 2020",
                   WolfpackLending.getDisbursementDate(8,30,true));
    }
    
    //5
    public void testGetDisbursmentDate7(){
        assertEquals("WolfpackLending.getDisbursementDate(10,28, true)", "Sun, 11 1 2020",
                   WolfpackLending.getDisbursementDate(10,28, true));
    }
    
    //6
    public void testGetDisbursmentDate8(){
        assertEquals("WolfpackLending.getDisbursementDate(9,15, false)", "Mon, 10 5 2020",
                   WolfpackLending.getDisbursementDate(9,15, false));
    }
    

    
    
    /**
     * Test the WolfpackLending methods with invalid values
     */ 
    @Test
    public void testInvalidMethods() {
        // Invalid test cases are provided for you below - You do NOT
        // need to add additional invalid tests. Just make sure these
        // pass!
        try {
            WolfpackLending.getInterestRate(0, 500, 5000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid loan amount", e.getMessage());
        }

        try {
            WolfpackLending.getInterestRate(1000, 200, 5000);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid credit score", e.getMessage());
        }

        try {
            WolfpackLending.getInterestRate(1000, 500, -20);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid income", e.getMessage());
        }

        try {
            WolfpackLending.getMonthlyPayment(-5, 5.5, 20);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid loan amount", e.getMessage());
        }

        try {
            WolfpackLending.getMonthlyPayment(3000, 0.49, 20);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid interest rate", e.getMessage());
        }

        try {
            WolfpackLending.getMonthlyPayment(4500, 5.5, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid number of months", e.getMessage());
        }
        
        try {
            WolfpackLending.getDisbursementDate(13, 4, true);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid date", e.getMessage());
        }

        try {
            WolfpackLending.getDisbursementDate(4, 31, false);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid date", e.getMessage());
        }   
    }
}
