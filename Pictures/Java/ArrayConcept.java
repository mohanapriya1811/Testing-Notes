import java.util.*;
public class ArrayConcept{

    static int numberOfGoodPairs(int[] arr){
        
        int count = 0;
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++)   {
            if(arr[i] == arr[j])
                count++;
            }
        }      
        
        return count;
    }

    static int[] smallerNumbersThanCurrent(int[] arr){
        int[] result = new int[arr.length];
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            count = 0;
            for(int j = arr.length-1; j>=0; j--)   {

            if(arr[i]>arr[j])
                count++;
            }
        result[i] = count;
        }
        return result;
    }

 

    

    public static void main(String[] args){
        //int[] nums = {0,1,2,3,4};
        //int[] index = {0,1,2,2,1};
            String str = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram((str));

}

}
