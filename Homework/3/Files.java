import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.PrintStream;
import java.io.FileNotFoundException;

/**
 * This program aims to assess your ability to use Scanners and PrintStreams to work with files and
 * strings. You are asked to complete 5 methods, each of which is worth 10 points. The method 
 * 'filesIdentical' is already completed and is intended to help test your program
 * @author Spencer Yoder
 * @author Nicholas Loftin
 */
public class Files {
  
  /**
   * The main method is intended to help test your program and ensure it compiles.
   * Feel free to add tests but understand that removing tests may be to your detriment.
   * @param args command line arguments
   */
  public static void main(String[] args) {
    convertFile("java.txt", "java_output.txt");
    if(filesIdentical("expected_java_output.txt", "java_output.txt"))
      System.out.println("java output files equal");
    else
      System.out.println("java output files NOT equal");
    convertFile("NCSU.txt", "NCSU_output.txt");
    if(filesIdentical("expected_NCSU_output.txt", "NCSU_output.txt"))
      System.out.println("ncsu output files equal");
    else
      System.out.println("ncsu output files NOT equal");
    
    System.out.println("\nNames starting with \"S\":");
    reportNamesStartingWith("S");
    
    System.out.println("\nWord counts:");
    System.out.println("notafile.txt: " + wordCount("notafile.txt"));
    System.out.println("frankenstein.txt: " + wordCount("frankenstein.txt"));
    
    System.out.println("\nParsing doubles:");
    System.out.println("\"\": " + toDouble(""));
    System.out.println("\"Hello\": " + toDouble("Hello"));
    System.out.println("\"345.6\": " + toDouble("345.6"));
    
    System.out.println("\nCreating a file:");
    new File("new_file.txt").delete();
    if(createFile("new_file.txt"))
      System.out.println("File created!");
    else
      System.out.println("File could not be created.");
    if(createFile("new_file.txt"))
      System.out.println("File created!");
    else
      System.out.println("File could not be created.");
  }
  
  /**
   * Create a Scanner over a file with inputFile as the name
   * Create a PrintStream over a file with outputFile as the name
   * Read in all integers from the input file, convert them to characters, and print them in the
   * output file
   * @param inputFile the path to the input file
   * @param outputFile the path to the output file
   * @throws IllegalArgumentException if either of the files cannot be read
   */
  public static void convertFile(String inputFile, String outputFile) {
    //Your code goes here.
    try {
        Scanner in = new Scanner(new File(inputFile));
        PrintStream output = new PrintStream(new File(outputFile));
        while(in.hasNextLine()){
            String line = in.nextLine();
            Scanner curLine = new Scanner(line);
            while(curLine.hasNext()){
                int i = curLine.nextInt();
                char cha = (char) i;
                output.print(cha);
            }
            
            output.println("");
        }
    } catch(FileNotFoundException e){
        throw new IllegalArgumentException();
    }
  }
  
  /**
   * Create a Scanner over people.txt
   * Print to the console every name starting with the given String seperated by spaces
   * @param start all names printed should start with this String
   */
  public static void reportNamesStartingWith(String start) {
    //Your code goes here.
    try{
        Scanner in = new Scanner(new File("people.txt"));
        
        while(in.hasNextLine()){
            String line = in.nextLine();
            Scanner activeLine = new Scanner(line);
            while(activeLine.hasNext()){
                String obj = activeLine.next();
                if(obj.contains("name")){
                    obj = activeLine.next();
                    
                    if(obj.contains(start)){
                        System.out.print(obj + " ");
                    }
                }
            }
        }
        System.out.println();
    } catch (FileNotFoundException e){
        return;
    }
  }
  
  /**
   * Create a Scanner over a file with inputFile as the name
   * @param inputFile the path to the input file
   * @return 0 if the file does not exist, the number of tokens in the file if the file does
   */
  public static int wordCount(String inputFile) {
    //Your code goes here.
        try{
            Scanner in = new Scanner(new File(inputFile));
            int count = 0;
            
            while(in.hasNextLine()){
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                while (lineScanner.hasNext()){
                    lineScanner.next();
                    count++;
                }
            }
            return count;
        }catch (FileNotFoundException e){
            return 0;
        }
  }
  
  /**
   * Convert the given String to a double using a Scanner.
   * If the first token in the string cannot be parsed to a double, return Double.NaN
   * @param s the string to convert to a double
   * @return the value represented by s or Double.NaN if s cannot be parsed
   */
  public static double toDouble(String s) {
    //Your code goes here.
        Scanner in = new Scanner(s);
        
        while(in.hasNext()){
            if(in.hasNextDouble()){
                double val = in.nextDouble();
                return val;
            }
            return Double.NaN;
        }
        return Double.NaN;
  }
  
  /**
   * Create a file with the given filename.
   * @return false if the file can not be created OR it already exists
   */
  public static boolean createFile(String filename) {
    //Your code goes here.
        try{
            File f = new File(filename);
            
            if(f.createNewFile()){
                return true;
            }
            return false;
        }catch (IOException e) {
            throw new IllegalArgumentException();
        }

  }
  
  /**
   * THIS METHOD IS COMPLETE, DO NOT CHANGE
   * Compares the files with the given paths and returns whether they are equal
   * @param name1 a file path name
   * @param name2 a file path name
   * @return true if the files contain the same values (not accounting for different line endings)
   *         and false otherwise
   */
  public static boolean filesIdentical(String name1, String name2) {
    File f1 = new File(name1);
    File f2 = new File(name2);
    if(!f1.exists() || !f2.exists())
      return false;
    Scanner s1 = null;
    Scanner s2 = null;
    try {
      s1 = new Scanner(f1);
      s2 = new Scanner(f2);
    } catch(FileNotFoundException e) {
      if(s1 != null)
        s1.close();
      return false;
    }
    boolean identical = true;
    while(s1.hasNextLine() && s2.hasNextLine()) {
      if(!s1.nextLine().equals(s2.nextLine())) {
        identical = false;
        break;
      }
    }
    s1.close();
    s2.close();
    return identical;
  }
}
