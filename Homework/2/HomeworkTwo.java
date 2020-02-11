import java.util.Scanner;
/**
 * Add all the missing methods from this program. Leave the javadoc but feel free to replace the
 * single-line comments. The main method has tests, which if your program is correctly implemented,
 * will match the sample output in the program description. 
 *
 * Note that your methods will be tested for values other than what is present here, so simply 
 * matching the output here is not enough.
 *
 * Since these methods will be tested, they need to exactly match the description included.
 * Specifically, they must:
 * Be public
 * Have the same name as specified in the comments
 * Have the same parameters, with the same types, in the same order as in the comments
 *
 * Feel free to add additional tests to main.
 * @author Andrew Shon
 * @author Nicholas Loftin
 */
public class HomeworkTwo {
    /**
     * Starts the program. (Do not manipulate the tests for final submission. Keep as is!
     You may add more tests beforehand to increase your test coverage and confidence).
     * @param args command-line arguments
     */
   public static void main(String[] args) {
      int testOne = 0;
      if ("BotW".equals(printAcronym("Breath of the Wild"))) {
         testOne++;
      }
      if ("ItC".equals(printAcronym("Introduction to Computing"))) {
         testOne++;
      }		
      if ("Thus".equals(printAcronym("This has     uneven      spaces"))) {
         testOne++;
      }		
      if ("THuC".equals(printAcronym("This HAS unEVEN Capitalizations"))) {
         testOne++;
      }		
      System.out.println("Number of passing tests for printAcronym: " + testOne 
         + " / 4");
   	
   	
      int testTwo = 0;
      if ("HHeelllloo!!".equals(stutter("Hello!"))) {
         testTwo++;
      }
      if ("aabbbbccccccdddddddd".equals(stutter("abbcccdddd"))) {
         testTwo++;
      }
      if ("HHhhHHii!!!!".equals(stutter("HhHi!!"))) {
         testTwo++;
      }
      System.out.println("Number of passing tests for stutter: " + testTwo 
         + " / 3");
   		
      int testThree = 0;
      if (wordCount("how are you?") == 3) {
         testThree++;
      }
      if (wordCount("CSC 116 (007) Fall 2019 Introduction to Computing - Java") == 10) {
         testThree++;
      }
      if (wordCount("public static void main(String[] args)") == 5) {
         testThree++;
      }
      if (wordCount("De Morgan's Laws: Allows us to rewrite Boolean expressions " + 
      	"in different but equivalent ways") == 14) {
         testThree++;
      }
      System.out.println("Number of passing tests for wordCount: " + testThree 
         + " / 4");
   		
      int testFour = 0;
      if ("winter".equals(season(1, 1))) {
         testFour++;
      }
      if ("winter".equals(season(3, 15))) {
         testFour++;
      }
      if ("spring".equals(season(3, 16))) {
         testFour++;
      }
      if ("spring".equals(season(6, 15))) {
         testFour++;
      }
      if ("summer".equals(season(6, 16))) {
         testFour++;
      }
      if ("summer".equals(season(9, 15))) {
         testFour++;
      }
      if ("fall".equals(season(9, 16))) {
         testFour++;
      }
      if ("fall".equals(season(12, 15))) {
         testFour++;
      }
      if ("error".equals(season(12, 32))) {
         testFour++;
      }
      System.out.println("Number of passing tests for season: " + testFour 
         + " / 9");
   
   
   	
   }
	
	//TODO: Write a method called printAcronym that accepts a string as its parameter 
	//and prints the first letter of each word of the string as an acronym.
	//This method must return a String of the result
   
   public static String printAcronym(String str){
      String acronymChar = ""; 
      String charAc = "";
      String strDupe = str;
      String strCheck = str;
      //System.out.println(str);
      //System.out.println(str.length());
      //System.out.println("Original String = " + str);
      for(int i = 0; i < str.length(); i++){
         strCheck = str;
         if((i == 0) && (str.charAt(0) != ' '))
            acronymChar = str.substring(0,1);
         if ((str.charAt(i) == ' ')){
            if(str.charAt(i+1) != ' '){
               strCheck = str.substring(i);
               strDupe = strCheck.substring(0);
               strDupe = strDupe.trim();
               charAc = strDupe.substring(0, 1);
            
            
               acronymChar = acronymChar + charAc;
            }
            //working on this now
                       //charAc = charAc + acronymChar;
         }
             
      }
      
      //System.out.println(acronymChar);
      return acronymChar;
   }
	
	//TODO: Write a method called stutter that accepts a string parameter and
	//returns that string with its characters repeated twice. For example, 
	//stutter("Hello!") returns "HHeelllloo!!"
   public static String stutter(String str){
      String originalString = str;
      str = "";
      char stutter; 
      for(int i = 0; i < originalString.length(); i++){
         stutter = originalString.charAt(i);
         for(int n = 0; n < 2; n++){
            str += stutter;
         }
        
      }
        
      return str;
   
   }

	//TODO: Write a method called wordCount that accepts a String as its parameter and 
	//returns the number of words in the String. A word is a sequence of one or more 
	//nonspace characters (any character other than ' '). For example, the call
	//wordCount("hello") should return 1, the call wordCount("how are you?") should 
	//return 3, the call wordCount(" this string has wide spaces ") should return 5, 
	//and the call wordCount(" ") should return 0.
   public static int wordCount(String str){
      int counter = 1;
        
      if(str.indexOf(" ") == 0)
         return 0;
        
      for(int i = 0; i<str.length(); i++){
         if(str.charAt(i) == ' ')
            counter++;
      }
    
      return counter;
   }
    
    
	//TODO: Write a method called season that takes as parameters two integers 
	//representing a month and day and returns a String indicating the season for 
	//that month and day. Assume that the month is specified as an integer between 1 
	//and 12 (1 for January, 2 for February, and so on) and that the day of the month 
	//is a number between 1 and 31. If the date falls between 12/16 and 3/15, the method 
	//should return "winter". If the date falls between 3/16 and 6/15, the method 
	//should return "spring". If the date falls between 6/16 and 9/15, the method 
	//should return "summer". And if the date falls between 9/16 and 12/15, the 
	//method should return "fall" (Note: if you input an invalid month like -1 or an
	//invalid day like 32, return "error" as a String)
   public static String season(int month, int day){
        //System.out.print("Month: " + month);
        //System.out.println("     Day: " + day);
      if(month>12 || day > 31 || day < 1 || month<1)
         return "error";
        //this is inclusive on the days themselves fix if wrong
      if((month == 12 && day >= 16) || (month < 4 && (month<=3 && day < 16))){
            //System.out.println("W");
         return "winter";
            
      }
      else if((month >= 3 && month < 6) || (month == 6 && day <= 15)){
            //System.out.println("Sp");
         return "spring";
      }
            
      else if((month >= 6 && month < 9) || (month == 9 && day <= 15)){
            //System.out.println("Su");
         return "summer";
      }
      else if(month <= 12 || (month != 12 && day != 16)){
            //System.out.println("Fall");
         return "fall";
      }
      else{
            //System.out.println("Winter2");
         return "winter";
      }
        
    
    
   }    
	//TDODO:Write a sentinel loop that repeatedly prompts the user to enter a number
	//and, once the number –1 is typed, displays the maximum and minimum numbers that the user entered.
	
   public static void sentinalLoop(){
      Scanner in = new Scanner(System.in);
      System.out.print("Type a number (or -1 to stop): ");
      int input;
      input = in.nextInt();
      int max = -1;
      int min = -1;
      if(input != -1){
         min = input;
         max = input;
      }
      while(input != -1){
         System.out.print("Type a number (or -1 to stop): ");
         input = in.nextInt();
         if(input != -1){
            max = Math.max(max, input);
            min = Math.min(min, input);
         }
      }
      System.out.println("Your max num was: " + max);
      System.out.println("Your min num was: " + min);
   }
    
	//Here is a sample log of execution: 
	//Type a number (or –1 to stop): 5
	//Type a number (or –1 to stop): 2
	//Type a number (or –1 to stop): 17
	//Type a number (or –1 to stop): 8
	//Type a number (or –1 to stop): –1
	//Maximum was 17
	//Minimum was 2

	//Here is a sample log of execution: 
	//Type a number (or –1 to stop): 5
	//Type a number (or –1 to stop): –1
	//Maximum was 5
	//Minimum was 5

	//Here is a sample log of execution: 
	//Type a number (or –1 to stop): -3
	//Type a number (or –1 to stop): 4
	//Type a number (or –1 to stop): 10
	//Type a number (or –1 to stop): –1
	//Maximum was 10
	//Minimum was -3

	//Here is a sample log of execution: 
	//Type a number (or –1 to stop): -9
	//Type a number (or –1 to stop): –1
	//Maximum was -9
	//Minimum was -9

	
	//Here is a sample log of execution: 
	//Type a number (or –1 to stop): –1
	//Maximum was -1
	//Minimum was -1


	

}