import java.util.Scanner;
public class test{
   public static void main(String[] args){
      hw2methods test = new hw2methods();
      Scanner in = new Scanner(System.in);
      String a = "";
      /**
      System.out.println("Acronym: ");
      String input = in.nextLine();
      
      
      a = test.printAcronym(input);
      System.out.println(a);
      System.out.println("Stutter: ");
      input = in.nextLine();
      a = test.stutter(input);
      System.out.println(a);
      System.out.println("word count: ");
      input = in.nextLine();
      int count = test.wordCount(input);
      System.out.println("Count: " + count);
      */
      System.out.print("Enter a month of the year: "); 
   
      int in1 = in.nextInt();
      System.out.print("Enter a day of the month: ");
   
      int in2 = in.nextInt();  
      a = test.season(in1, in2);
      System.out.println(a);
      
      hw2methods.sentinalLoop();
      
   }


}