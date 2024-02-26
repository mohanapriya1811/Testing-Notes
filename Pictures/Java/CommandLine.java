import java.util.*;

public class CommandLine{

    public static void main(String[] args){
        System.out.println(args[1]);
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
    }

     static int[] shuffle(int[] nums, int n) {
        
        for(int i = 1; i<nums.length-1; i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}
