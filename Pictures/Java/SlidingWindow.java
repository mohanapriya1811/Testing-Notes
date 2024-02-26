import java.util.*;

public class SlidingWindow{
    static int naiveApproach(int[] arr, int m){
        int max = 0;
        for(int i = 0; i<=arr.length-m; i++){
            int sum = 0;
            for(int j = i; j<m+i; j++){
                sum += arr[j];
            }
           if(sum>max)
                max = sum;
        }
        return max;
    }
     
    static int optimized(int[] arr, int m){
        int sum = 0;  
        int max = 0;      
        for(int i = 0; i<m; i++){
            max += arr[i];            
        }
        sum = max;
        for(int i = m; i<arr.length; i++){
            sum = sum +(arr[i]-arr[i-m]);  
                if(sum>max)
                max = sum;               
        }
        
        return max;
    }   
    
    public static void main(String[] args){
        int[] arr =  {10,20,10,30,5};
        int m = 3;
        System.out.println(optimized(arr, m));

}

}
