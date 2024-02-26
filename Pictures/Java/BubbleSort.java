import java.util.*;
public class BubbleSort{
    
    static void bubbleSort(int[] arr, int n){
        int temp;        
        for(int i = 0; i<n-i; i++){

            for(int j = 1; j<n; j++){
             if(arr[j]<arr[j-1]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
             }
            }
        }      
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){

     int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
     int n = arr.length;
    
    bubbleSort(arr, n);
}
}
