public class goingThroughWithIt{
    public static void main(String[] args){
        String output = convertLineToGreyScale("255 105 180 255 105 180 255 105 180 255 105 180");
        System.out.println(output);
    }
    
    public static String convertLineToGreyScale(String line){
        String pxl = "";
        Scanner in = new Scanner(line);
        int sum = 0;
        do{
            sum = 0;
            for(int i = 0; i < 3; i++){
                sum += in.nextInt();
            }
            double average = (double) sum/3;
            int meanIntValue = (int) average;
            
        }while(in.hasNext());
        
    }

}