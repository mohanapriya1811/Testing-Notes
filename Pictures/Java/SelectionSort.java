import java.util.*;

public class SelectionSort{

public static void selectSort(int[] arr){
      
    
    for(int i = 0; i<arr.length; i++){
       int last = arr.length-1-i;
       int max = getMaxIndex(arr, 0, last);
       swap(arr, max, last);
    }    
 }
static int getMaxIndex(int[] arr, int start, int end){
    int max = start;
    for(int i = start; i<end; i++){
    if(arr[i]>arr[max]){
        max = i;
    }

    }
    

return max;    

}

static void swap(int[] arr, int first, int second){
    int temp;

    temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
    
}


public static void main(String[] args){

    int[] arr = {5, 4, 3, 1, 2};
    System.out.println(getMaxIndex(arr, 0, arr.length));
   // selectSort(arr);
    

}

}
