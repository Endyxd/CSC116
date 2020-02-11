import java.util.Scanner;
public class p5{
public static void ifElseMystery(int a, int b){
    if(a*2 < b){
        a *=3;
    }
    if(b<a){
        b++;
    }else{
        a--;
    }
    System.out.println(a + " " + b);


}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Int a: ");
        a = in.nextInt();
        System.out.print("Int b: ");
        b = in.nextInt();
        ifElseMystery(a, b);
    
    }

}