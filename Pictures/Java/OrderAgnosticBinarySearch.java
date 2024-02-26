public class OrderAgnosticBinarySearch{

    
    
    public static int binary(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        int mid;
        while(start<=end){
            
           mid = start + (end - start)/2;
           
           if(arr[mid] == target)
            return mid;
           if(arr[start]>arr[end]){
                
                if(arr[mid]>target){
                    start = mid +1;
                }
                else{
                    end = mid - 1;
                }

            }
           else {
                if(arr[mid]>target){
                    end = mid-1;
                }                
                else{
                start = mid+1;
                }
           
         }
       
        }          

         return -1;

        }

 public static void main(String[] args){
        int[] arr = {6, 5, 4, 3, 2, 1};
        int target =  5;

        System.out.println(binary(arr, target));
    }

}
