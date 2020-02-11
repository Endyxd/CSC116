public class matTest{
    public static void main(String[] args){
        int[] matrix = {2, 4, 5, 6};
        int[] matClone = matrix;
        for(int i = 0; i < matrix.length; i++){
            System.out.println(matClone[i]);
        }
    }
}