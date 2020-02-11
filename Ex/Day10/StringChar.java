/*
*This program is to take an input string, then an input char, 
*and count how many times it is in the string
* author @ Nicholas Loftin nlloftin@ncsu.edu
* Version 1
*/


import java.util.Scanner;

public class StringChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0;
        String input = " ";
        char inputchar;
        System.out.print("Enter a string: ");
        input = in .nextLine();
        System.out.print("Now enter a character to search: ");
        inputchar = in .next().charAt(0);
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputchar)
                counter++;



        }
        System.out.println("The ammount of times " + inputchar + " appears in your string " +
            input + " is " + counter + " time(s) ");



    }




}