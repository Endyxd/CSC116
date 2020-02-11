import java.util.*;
public class appendClass{
    public static void main(String[] args){
        int[] arr1 = new int[]{1, 2, 4, 5, 6};
        int[] arr2 = new int[]{7, 6, 3};
        int[] arrOutput = append(arr1, arr2);
        for(int i = 0; i < arrOutput.length; i ++){
            System.out.print("[" + arrOutput[i] + "]");
        }
    }
    public static int[] append(int[] arr1, int[] arr2){
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] arrOutput = new int[arr1Length + arr2Length];
        for(int i = 0; i < arr1Length; i++){
            arrOutput[i] = arr1[i];
        }
        for(int i = 0; i < arr2Length; i++){
            arrOutput[i+arr1Length] = arr2[i];
        }
        return arrOutput;
    }
}