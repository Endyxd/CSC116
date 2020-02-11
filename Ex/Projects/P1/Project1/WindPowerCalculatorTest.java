/**
 * Tests WindPowerCalculator program
 * @author Suzanne Balik
 */
public class WindPowerCalculatorTest {
    /**
     * Tests WindPowerCalculator program
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        double power = WindPowerCalculator.calculateWindPower(23, 110, 11);
        System.out.println("\nExpected: 1781.9160360526805  \nActual:   " + power);
    }
}