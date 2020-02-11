import java.util.Scanner;
public class quadrant{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inx;
        int iny;
        System.out.println("Enter your two numbers: ");
        System.out.print("x: ");
        inx = in.nextInt();
        System.out.print("y: ");
        iny = in.nextInt();
        
        if(inx > 0 && iny>0)
            System.out.println("Q1");
        else if(inx < 0 && iny>0)
            System.out.println("Q2");
        else if(inx < 0 && iny<0)
            System.out.println("Q3");
        else if(inx >0 && iny < 0)
            System.out.println("Q4");
            
        if(inx == 0 || iny ==0)
            System.out.println("Error, either on origin, or on line");
    
    
    }


}