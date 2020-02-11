/**
This program is for adding the area for both 3 circles and 2 rectangles
This is a program by Nicholas Loftin; nlloftin@ncsu.edu
Version 1
:3

**/

public class area{
public static void main(String[] args){

        int rHeight = 2;
        int rWidth = 3;
        int circleR = 5/2;
        final double pi = 3.14;
        double areaC;
        double areaR;
        areaC = Math.pow(circleR,2) * pi * 3;
        // this is area for the 3 circles
        areaR = (rHeight * rWidth) * 2;
        // area for the two rectangles
        double areaAll = areaR + areaC;
        System.out.println("The area of the circles is: " + areaC);
        System.out.println("The area of the rectangles is: " + areaR);        
        System.out.println("The final area of everything together is: " + areaAll);
        





}





}
