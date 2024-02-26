import java.util.*;
public class SourceClass{
    static void shuffle(int[] arr, int n){
     int i = 0;
        int j = n;
        int k = 0;
        int[] target = new int[2*n];
        while(i<n){
            target[k] = arr[i]; // 2
            System.out.println(target[i]);
            target[k+1] = arr[j]; 
            System.out.println(target[i+1]);
            i++;
            k=k+2;
            j++;

        }

    System.out.println(Arrays.toString(target));
    }


    static void candies(int[] arr, int extra){
        
        boolean[] result = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){

            int count = arr[i] + extra;

            for(int j = 0; j<arr.length; j++){

                if(count>arr[j]){
                    result[i] = true;
                }
                else{

                    result[i] = false;
                }

            }
        
        }
  
    System.out.println(Arrays.toString(result));

    }
    public static void main(String[] args){

        int[] arr = {2,3,5,1,3}; // 2, 3, 5, 4, 1, 7
/*
                    temp = 3;
                    2,5,5,1,4,7
                    2,3,5,1,4,7
                    temp = 4;
                    2,3,5,5,1,7
                    2,3,5,4,1,7*/
        int extra = 3;
        candies(arr, extra);
       
    }
}
