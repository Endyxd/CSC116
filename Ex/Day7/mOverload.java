public class mOverload{
    public static float average(int a, int b){
        float fin;
        fin = (a + b)/2;
        return fin;
    }
    
    public static float average(int a, int b, int c){
        float fin;
        fin = (a + b + c)/3;
        return fin;
    
    }
    
    
    public static void main(String[] args){
        System.out.println("AV 1: " + average(2, 10, 5));
        System.out.println("AV 2: " + average(2, 5));
    
    
    }

}
