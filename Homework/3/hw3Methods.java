import java.util.*;
public class hw3Methods{
   public static String integerList(Scanner scan) {
    //Your code here.
      int i = 0;
      List<Integer> values = new ArrayList<Integer>();
      int val = 0;
      do{
        
        try{
            val = scan.nextInt();
            values.add(val);
        }
        catch(InputMismatchException e){
            
        }
        i++;
      }while(val != -1);
      String[] out = GetStringArray(values);
     for(int j = 0; j < values.size(); j++){
        
     }
   }
    
   public static void main(String[] args){
    
   }
}