import org.junit.Test;
import junit.framework.TestCase;

/**
 * Program to test ImageEditor methods
 * @author Suzanne Balik
 * @author Nicholas Loftin
 */
public class ImageEditorTest extends TestCase {


    /** Red Line */
    public static final String RED_LINE = "255 0 0 255 0 0 255 0 0 255 0 0";
    
    /** Red Line in High Contrast */
    public static final String RED_LINE_HC = "255 0 0 255 0 0 255 0 0 255 0 0";
    
    /** Red Line in Grey Scale */
    public static final String RED_LINE_GS = "85 85 85 85 85 85 85 85 85 85 85 85";

    /** Red Line with added Green and Blue */
    public static final String RED_LINE_GB = "255 10 20 255 10 20 255 10 20 255 10 20";
        
    /** Blue Line */
    public static final String BLUE_LINE = "0 0 255 0 0 255 0 0 255 0 0 255";
    
    /** Blue line HC */
    public static final String BLUE_LINE_HC = "0 0 255 0 0 255 0 0 255 0 0 255";
    
    /** Blue Line GS */
    public static final String BLUE_LINE_GS = "85 85 85 85 85 85 85 85 85 85 85 85";
    
    /** Blue Line CLI */
    public static final String BLUE_LINE_CLI = "50 20 255 50 20 255 50 20 255 50 20 255";
    
    /** Green Line */
    public static final String GREEN_LINE = "0 255 0 0 255 0 0 255 0 0 255 0";
    
    /** Green Line HC */
    public static final String GREEN_LINE_HC = "0 255 0 0 255 0 0 255 0 0 255 0";
    
    /** Green Line GS */
    public static final String GREEN_LINE_GS = "85 85 85 85 85 85 85 85 85 85 85 85";
    
    /** Green Line CLI */
    public static final String GREEN_LINE_CLI = "70 255 45 70 255 45 70 255 45 70 255 45";
    
    /** White Line */
    public static final String WHITE_LINE = "255 255 255 255 255 255 255 255 255 255 255 255";
    
    /** White Line HC*/
    public static final String WHITE_LINE_HC = "255 255 255 255 255 255 255 255 255 255 255 255";
    
    /** White Line GS*/
    public static final String WHITE_LINE_GS = "255 255 255 255 255 255 255 255 255 255 255 255";
    
    /** White Line CLI*/
    public static final String WHITE_LINE_CLI = "205 150 105 205 150 105 205 150 105 205 150 105";
    
    /** Pink line */
    public static final String PINK_LINE = "255 105 180 255 105 180 255 105 180 255 105 180";
    
    /** Pink line HC*/
    public static final String PINK_LINE_HC = "255 0 255 255 0 255 255 0 255 255 0 255";
    
    /** Pink line GS*/
    public static final String PINK_LINE_GS = "180 180 180 180 180 180 180 180 180 180 180 180";
    
    /** Pink Line CLI */
    public static final String PINK_LINE_CLI = "255 160 200 255 160 200 255 160 200 255 160 200";


    @Test
    public void testConvertLineToHighContrast1() {
        String description = "Convert Line to High Contrast 1";
        String actual = ImageEditor.convertLineToHighContrast(RED_LINE);
        assertEquals(description, RED_LINE_HC, actual);
    }
    
    //1
    @Test
    public void testConvertLineToHighContrast2() {
        String description = "Convert Line to High Contrast 2";
        String actual = ImageEditor.convertLineToHighContrast(BLUE_LINE);
        assertEquals(description, BLUE_LINE_HC, actual);
    }
    //2
    @Test
    public void testConvertLineToHighContrast3() {
        String description = "Convert Line to High Contrast 3";
        String actual = ImageEditor.convertLineToHighContrast(GREEN_LINE);
        assertEquals(description, GREEN_LINE_HC, actual);
    }
    
    //3
    @Test
    public void testConvertLineToHighContrast4() {
        String description = "Convert Line to High Contrast 4";
        String actual = ImageEditor.convertLineToHighContrast(PINK_LINE);
        assertEquals(description, PINK_LINE_HC, actual);
    }
    //4
    @Test
    public void testConvertLineToHighContrast5() {
        String description = "Convert Line to High Contrast 5";
        String actual = ImageEditor.convertLineToHighContrast(BLUE_LINE);
        assertEquals(description, BLUE_LINE_HC, actual);
    }

    
    @Test
    public void testConvertLineToGreyScale1() {
        String description = "Convert Line to Grey Scale 1";
        String actual = ImageEditor.convertLineToGreyScale(RED_LINE);
        assertEquals(description, RED_LINE_GS, actual);
    }
    //1
    @Test
    public void testConvertLineToGreyScale2() {
        String description = "Convert Line to Grey Scale 2";
        String actual = ImageEditor.convertLineToGreyScale(BLUE_LINE);
        assertEquals(description, BLUE_LINE_GS, actual);
    }
    //2
    @Test
    public void testConvertLineToGreyScale3() {
        String description = "Convert Line to Grey Scale 3";
        String actual = ImageEditor.convertLineToGreyScale(BLUE_LINE);
        assertEquals(description, BLUE_LINE_GS, actual);
    }
    
    //3
    @Test
    public void testConvertLineToGreyScale4() {
        String description = "Convert Line to Grey Scale 4";
        String actual = ImageEditor.convertLineToGreyScale(GREEN_LINE);
        assertEquals(description, GREEN_LINE_GS, actual);
    }
    //4
    @Test
    public void testConvertLineToGreyScale5() {
        String description = "Convert Line to Grey Scale 5";
        String actual = ImageEditor.convertLineToGreyScale(PINK_LINE);
        assertEquals(description, PINK_LINE_GS, actual);
    }
    
   

    @Test
    public void testChangeLineIntensity1() {
        String description = "Change Line Intensity 1";
        String actual = ImageEditor.changeLineIntensity(RED_LINE,0,10,20);
        assertEquals(description, RED_LINE_GB, actual);
    }
    //1
    @Test
    public void testChangeLineIntensity2() {
        String description = "Change Line Intensity 2";
        String actual = ImageEditor.changeLineIntensity(BLUE_LINE,50,20,0);
        assertEquals(description, BLUE_LINE_CLI, actual);
    }
    //2
    @Test
    public void testChangeLineIntensity3() {
        String description = "Change Line Intensity 3";
        String actual = ImageEditor.changeLineIntensity(GREEN_LINE,70,0,45);
        assertEquals(description, GREEN_LINE_CLI, actual);
    }
    //3
    @Test
    public void testChangeLineIntensity4() {
        String description = "Change Line Intensity 4";
        String actual = ImageEditor.changeLineIntensity(WHITE_LINE,-50,-105,-150);
        assertEquals(description, WHITE_LINE_CLI, actual);
    }
    //4
    @Test
    public void testChangeLineIntensity5() {
        String description = "Change Line Intensity 5";
        String actual = ImageEditor.changeLineIntensity(PINK_LINE, 0, 55, 20);
        assertEquals(description, PINK_LINE_CLI, actual);
    }

   

}
