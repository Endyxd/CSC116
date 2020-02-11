import java.util.*;
import java.io.*;
/**
 *This program is to edit photos by greyscale, contrast, 
 *or color intensity
 *@author Nicholas Loftin
 *Version 2.1
 */
public class ImageEditor {

    /**This is a place holder number that is used for the change intensity*/
    public static final int PLACE_HOLDER = -500;

    /** The minimum length a filename can be before it is illegal*/
    public static final int MINIMUM_FILE_NAME_LENGTH = 4;

    /**The number used to determine the change of intensity*/
    public static final int INTENSITY_CHECK = 128;

    /**Maximum RGB value*/
    public static final int RGB_VAL = 255;


    /**
     *This method determines if the file requested actually exists or not
     *@param filename Name of the file the user wants to edit
     *@return Scanner of input file chosen by user
     *
     */
    public static Scanner getInputScanner(String filename) {
        if (filename.length() < MINIMUM_FILE_NAME_LENGTH) {
            System.out.println("Invalid filename");
            return null;
        }
        if ((filename.substring(filename.length() -
                MINIMUM_FILE_NAME_LENGTH)).equals(".ppm") != true) {
            System.out.println("Invalid filename");
            return null;
        }
        //Scanner in = new Scanner (System.in);
        //return in;
        Scanner input;
        try {
            input = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            return null;
        }
        return input;
    }

    /**
     *This method is used to create the output file of the edited photo
     *This method also checks to see if the file already exists or not
     *@param console Scanner of file user wishes to edit
     *@return returns output file of new image
     */
    public static PrintStream getOutputPrintStream(Scanner console) {
        System.out.print("Enter an output file name: ");
        Scanner in = new Scanner(System.in);
        String filename = in .next();
        PrintStream out = null;
        if (filename.length() < MINIMUM_FILE_NAME_LENGTH) {
            System.out.println("Invalid filename");
            return null;
        }
        if ((filename.substring(filename.length() -
                MINIMUM_FILE_NAME_LENGTH)).equals(".ppm") != true) {
            System.out.println("Invalid filename");
            return null;
        }
        File outputFile = new File(filename);
        if (outputFile.exists()) {
            System.out.print("Is it OK to overwrite the existing file? (y or n)");
            String yOrN = in .next();
            yOrN = yOrN.toLowerCase();
            if (yOrN.charAt(0) == 'y') {
                try {
                    out = new PrintStream(outputFile);
                    return out;
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                    System.exit(1);
                }
            } else
                return null;
        } else {
            try {
                out = new PrintStream(outputFile);
                return out;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        }
        return null;

    }
    /**
     *The method that sends the scanner to increase the contrast
     *@param input Scanner of the input file chosen
     *@param output output file of edited photo
     *
     */
    public static void highContrast(Scanner input, PrintStream output) {
        String line = "";
        do {
            line = input.nextLine();
            //System.out.println(line);
            output.println(convertLineToHighContrast(line));
        } while (input.hasNextLine());
    }
    //Creates and returns a high contrast version of line, as described above, with one space 
    //between each color value, but no space at the end of the new line
    /**
     *Method that converts each line individually to increase contrast
     *@param line The current line on the input image
     *@return returns the line of numbers used to create the new image
     */
    public static String convertLineToHighContrast(String line) {
        Scanner in = new Scanner(line);
        String pxl = "";
        int checker = in .nextInt();
        if (checker < INTENSITY_CHECK) {
            pxl += "0";
        } else if (checker >= INTENSITY_CHECK) {
            pxl += "255";
        }
        do {
            int check = in .nextInt();
            if (check < INTENSITY_CHECK) {
                pxl += " 0";
            } else if (check >= INTENSITY_CHECK) {
                pxl += " 255";
            }
        } while ( in .hasNext()); 
        in .close();
        return pxl;
    }

    /**
     *The method that takes each line of the image and converts each line to a string 
     *which then is sent to the next method
     *@param input Scanner of the input file
     *@param output output location of edited photo
     */
    public static void greyScale(Scanner input, PrintStream output) {
        String line = "";

        do {
            line = input.nextLine();
            //System.out.println(line);
            output.println(convertLineToGreyScale(line));
        } while (input.hasNextLine());
    }

    /**
     *Converts each line to find the average of each rgb value
     *@param line current line of image
     *@return returns the line of numbers used to create the new image
     */
    public static String convertLineToGreyScale(String line) {
        //return "hah";
        Scanner in = new Scanner(line);
        String pxl = "";
        int sum = 0;
        do {
            sum = 0;
            for (int i = 1; i <= 3; i++) {
                sum += in .nextInt();
                //      System.out.println("Sum: " + sum);
            }
            double mean = (double) sum / 3;
            //  System.out.println("mean: " + mean);
            int meanInt = (int) mean;
            //   System.out.println("meanInt: " + meanInt);
            //            System.out.println(meanInt);
            if ( in .hasNext()) {
                pxl += meanInt + " " + meanInt + " " + meanInt + " ";
            } else if (! in .hasNext()) {

                pxl += meanInt + " " + meanInt + " " + meanInt + "";
            }
        } while ( in .hasNext()); 
        in .close();
        return pxl;
    }
    /**
     *Takes each value from user of each color they want to change
     *and by how much
     *@param input input file
     *@param output output file
     *@param redChange change in red value
     *@param greenChange change in green value
     *@param blueChange change in blue value
     */
    public static void changeIntensity(Scanner input, PrintStream output, int redChange,
        int greenChange, int blueChange) {
        String line = "";

        do {
            line = input.nextLine();
            //System.out.println(line);
            output.println(changeLineIntensity(line, redChange, greenChange, blueChange));
        } while (input.hasNextLine());



    }

    /**
     *Changes each rgb value of image to desired level
     *@param line current line of image
     *@param redChange change in red value
     *@param greenChange change in green value
     *@param blueChange change in blue value
     *@return returns the line of numbers used to create the new image
     */
    public static String changeLineIntensity(String line, int redChange,
        int greenChange, int blueChange) {
        Scanner in = new Scanner(line);
        int r;
        int g;
        int b;
        String pxl = "";
        do {
            r = in .nextInt();
            g = in .nextInt();
            b = in .nextInt();

            r = r + redChange;
            g = g + greenChange;
            b = b + blueChange;

            if (r > RGB_VAL)
                r = RGB_VAL;
            else if (r < 0)
                r = 0;

            if (g > RGB_VAL)
                g = RGB_VAL;
            else if (g < 0)
                g = 0;

            if (b > RGB_VAL)
                b = RGB_VAL;
            else if (b < 0)
                b = 0;
            if ( in .hasNext()) {
                pxl += r + " " + g + " " + b + " ";
            } else {
                pxl += r + " " + g + " " + b;
            }
        } while ( in .hasNext());
        return pxl;
    }
    /**
     *Main method for beginning the edit
     *Main method loops unless q is entered before each image request
     *@param args none
     */
    public static void main(String[] args) {
        System.out.println("WELCOME");
        do {
            System.out.print("Enter a file name to edit or q to quit: ");
            Scanner in = new Scanner(System.in);
            String fileName = in .next();
            if (fileName.length() == 1) {
                if (fileName.charAt(0) == 'q' || fileName.charAt(0) == 'Q') {
                    System.exit(1);

                }
            }
            Scanner file = getInputScanner(fileName);
            if (file == null) {
                System.out.println("Error, file is either not accepted or the" +
                    "file does not exist please try again.");
                System.exit(1);
            }
            PrintStream output = getOutputPrintStream(file);
            output.println(file.nextLine());
            output.println(file.nextLine());
            output.println(file.nextLine());
            System.out.println("Enter H-igh Contrast, G-rey Scale, or C-hange intensity: ");
            System.out.print("Choice: ");
            String choice = in .next();
            if (choice.equals("h") || choice.equals("H")) {
                highContrast(file, output);

            } else if (choice.equals("g") || choice.equals("G")) {
                greyScale(file, output);

            } else if (choice.equals("c") || choice.equals("C")) {

                int redChange = PLACE_HOLDER;
                int blueChange = PLACE_HOLDER;
                int greenChange = PLACE_HOLDER;
                while (redChange == PLACE_HOLDER) {
                    try {
                        System.out.print("Enter the change in red you want (-255 - 255): ");
                        redChange = in .nextInt();
                    } catch (InputMismatchException e) {
                        System.out.print("Enter an integer: ");
                    }
                }
                while (greenChange == PLACE_HOLDER) {
                    try {
                        System.out.print("Enter the change in green you want (-255 - 255): ");
                        greenChange = in .nextInt();
                    } catch (InputMismatchException e) {
                        System.out.print("Enter an integer: ");
                    }
                }

                while (blueChange == PLACE_HOLDER) {
                    try {
                        System.out.print("Enter the change in blue you want (-255 - 255): ");
                        blueChange = in .nextInt();
                    } catch (InputMismatchException e) {
                        System.out.print("Enter an integer: ");
                    }
                }

                changeIntensity(file, output, redChange, greenChange, blueChange);

            } else {
                System.out.println("Invalid Choice");
                System.exit(1);
            }
            System.out.println("Done");
        } while (1 == 1);

    }


}