import java.util.Arrays;
public class Sorting{

static void bubbleSort(int[] arr){

    for(int i = 0; i<arr.length; i++){

      for(int j = 1; j<arr.length-i; j++){
        if(arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j] = temp;
        }
    }
    }
System.out.println(Arrays.toString(arr));
}

static void selectionSort(int[] arr){

    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr.length-i; j++){
        if(arr[i] >arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
      }

    }
    System.out.println(Arrays.toString(arr));
}            


public static void main(String[] args){
    
    int[] arr = {-5, 3, 4 , 2, 1, 0};

    selectionSort(arr);

}

}

