import java.util.*;

public class ArrayDemo{

    static int[]   freqOfNo(int[] arr){
      int[] count = new int[arr.length];
        int countNo;
        for(int i = 0; i<arr.length; i++){
            countNo = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                countNo++;
                count[j] = -1;
                }
            }
        if(count[i] != -1)
        count[i] = countNo;
         }

        return count;
        }

    static int additionOfOdd(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2 !=0 ){
                sum += arr[i];            
            }
        }
        return sum;
    }

    static int[] moveLeftOnce(int arr[]){
        int temp;
        for(int j = 0; j<=2; j++){
            temp = arr[j];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }   
        arr[arr.length-1] = temp;
        }
        return arr;
    }

     static int[] moveRignthOnce(int arr[]){
        int temp;
        for(int j = 0; j<=2; j++){
            temp = arr[arr.length-1];
         for(int i = 0; i<arr.length-1; i++){
            arr[i+1] = arr[i];
        }   
        arr[0] = temp;
        }
        return arr;
    }    
    public static void main(String[] args){

        int arr[] = {1, 3, 4, 2, 2};
        System.out.println(Arrays.toString(moveRignthOnce(arr)));
        //System.out.println(additionOfOdd(arr));
}

}
