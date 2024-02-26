import java.util.*;

public class ArrayDataStructure{

    static void numLeft(int[] arr, int d){
    
        for(int i = 0; i<d; i++){
            
            rotateLeft(arr);    
        }
        System.out.println(Arrays.toString(arr));
        }

    static void numRight(int[] arr, int d){
        for(int i = 0; i<d ; i++){
            
            rotateRight(arr);    
        }
        
        System.out.println(Arrays.toString(arr));

        }
        
    


    static void rotateLeft(int[] arr){
    int temp = arr[0];
    int i;
    for(i = 0; i<arr.length-1; i++){
        arr[i] = arr[i+1];
    }
    arr[arr.length-1] = temp;
    System.out.println(Arrays.toString(arr));
    }  

    
    static void rotateRight(int[] arr){
    int temp = arr[arr.length-1];
    int i;
    for(i = arr.length-1; i>0; i--){
        arr[i] = arr[i-1];
    }
    arr[0] = temp;
    System.out.println(Arrays.toString(arr));
    }
    

    static void tempLeft(int[] arr, int d){

        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = d; i<arr.length; i++){
                temp[j] = arr[i];
                j++;
            }
        

        for(int k = 0; k<d; k++){
            temp[j] = arr[k];
            j++; 
        }
    System.out.println(Arrays.toString(temp));
    }

      static void tempRight(int[] arr, int d){

        int[] temp = new int[arr.length];
        int j = 0;            
        for(int i = arr.length-d; i<arr.length-1; i++){
            temp[j] = arr[i];
            j++;        
        }
        for(int k = 0; k<=d; k++){
            temp[j] = arr[k];
            j++;
    }
 
    System.out.println(Arrays.toString(temp));
    }

    public static void jugglingAlgorithm(int[] arr, int d){

        d = d%arr.length;
        

    }

    public static int gcd(int numOne, int numTwo){
        int smallNo = numOne<numTwo ? numOne:numTwo;
        for(int i = smallNo; i>=1; i--){
        if(numOne % i ==0 && numTwo%i ==0)
            return i;

    }
    return -1;
    }
    public static void main(String[] args){
    
    int[] arr ={1, 2, 3, 4,  5};
    int d = 3;

    //rotateLeft(arr);
    //rotateRight(arr);
    //numLeft(arr, d);
    //numRight(arr, d);
    tempRight(arr, d);
     System.out.println(gcd(10, 15));
    }
            
    
}
