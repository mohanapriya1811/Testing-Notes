import java.util.Scanner;

public class GuessNumber{
    
    public static int guessNumber(int n){
    
        int start = 1;
        int end = n;
        

        while(start<end){

            int mid = start+(end-start)/2;
            
        if(guess(mid) == 0){
            return mid;        
        }

        else if(guess(mid) == 1){
           
            start = mid +1;
        }
        else{

             end = mid -1;
        }
        
    }
    return -1;
    }
    static int guess(int mid){
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        if(mid == pick)
            return 0;
        else if(mid >pick)
            return 1;
        else
            return -1;

    }


    public static void main(String[] args){
        
        System.out.println(guessNumber(10));

    }

}
