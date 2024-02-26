import java.util.*;

public class LeetCodeProblems{
    

    static int[] mergeSorted(int[] arr1, int[] arr2, int m, int n){

     int i = m-1;
     int j = n-1;
     int k = m+n -1;
     while(j>=0){
        if(i>=0 && arr1[i]>arr2[j]){
            arr1[k--] = arr1[i--];
        }
        else {
            arr1[k--] = arr2[j--];        
        }
    }
       return arr1;     
    
    }

// []  [2 5 6]

//     

    static int  removeElement(int[] arr, int val){
  
        
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while(start<end){        
            if(arr[end] == val){
                end--;
            }
            else{
                 temp = arr[end]; 
                 arr[end] = arr[start];
                 arr[start] = temp;          
                
            }
             start++;
        }
        return start;
    }

    static boolean[] extraCandies(int[] arr, int extra){
        int max = 0;
        boolean arrBoo[] = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max){
                max = arr[i];
        }
       }
        int candies = 0;    
        for(int j=0; j<arr.length; j++){
            candies = arr[j] +extra;
            if(candies>=max){
                arrBoo[j] = true;
            }
            else{
                arrBoo[j] = false;
            }
        }
        return arrBoo;
    }


    static int[] createTargetArrays(int[] arr, int[] index){
        int value = 0;
        int[] target = new int[arr.length]; // 0, 1, 2, 2, 1
        
        for(int i = 0; i<index.length; i++){
            value = index[i]; // 0  // 1
            for(int j = 0; j<i; j++){  //j = 0
                if(j == value && target[j] == 0){ // 0 == 0 && 0 == 0
                    target[j] = arr[j]; // target[0] = 0;
                       
                }
                
               
            }
        


    }
        return target;

    }


    
    public static int maximumPopulation(int[][] logs) {
        int min = 0;
        for(int[] arr: logs){
            int num = arr[0];
             min = logs[0][0];   
           //System.out.println(min);
            for(int i = 0; i<logs.length; i++){
                //System.out.println(logs[i][0]);
                //System.out.println((logs[i][1]-1));
                if((logs[i][0]<=num) && (num<(logs[i][1]-1)))
                {
                    if(min>logs[i][0]){
                        min = logs[i][0];
                    }
                }
            
            }
               
        }
       
        return min;
    }

    
 
    public static void main(String[] args){
    
        //int[] arr1 = {1, 2, 3, 0, 0, 0};
        //int[] arr2 = {2, 5, 6};
        //int m = 3;
        //int n = 3;

          int[][] logs ={{1993,1999},{2000,2010}};        
        System.out.println(maximumPopulation(logs));
    
            
}

}
