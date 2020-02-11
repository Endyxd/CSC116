import java.util.Scanner;
public class hw2methods{	
	//TODO: Write a method called printAcronym that accepts a string as its parameter 
	//and prints the first letter of each word of the string as an acronym.
	//This method must return a String of the result
    
    public static String printAcronym(String str){
      String acronymChar = ""; 
      String charAc = "";
      //System.out.println(str);
      //System.out.println(str.length());
      charAc = str.substring(0, 1);
      for(int i = 1; i < str.length(); i++){
         if ((str.charAt(i) == ' ')){
            acronymChar = str.substring(i, i+2);
            charAc = charAc.trim();
            charAc = charAc + acronymChar;
         }
             
      }
      
      System.out.println(charAc);
      return charAc;
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
        if(month>12 || day > 31 || day < 1 || month<1)
            return "error";
        //this is inclusive on the days themselves fix if wrong
        if((month == 12 && day >= 16) || (month >= 1 && month < 4 && day <= 15))
            return "winter";
        else if((month >= 3 || month < 7) && (month != 6 && day != 16))
            return "spring";
        else if((month >= 6 || month < 10) && (month!= 9 && day!=16))
            return "summer";
        else if((month > 10 && (month != 9 && day != 16) || (month == 12 && day < 16)))
            return "fall";
            
        return "null";  
    
    
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