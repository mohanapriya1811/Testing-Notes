import java.lang.*;
import java.util.*;
public class InterviewBit{

    static void stringProblem(){
    
        Scanner sc = new Scanner(System.in);
        String first  = sc.next();
        String second = sc.next();
        String result = first + " " + second;
        
        System.out.println(first.length() + second.length());
        
        if(first.charAt(0)>second.charAt(0)){
            System.out.println("Yes");
        } 
        else{
          System.out.println("No");
        }
        
        System.out.println(result.toUpperCase());
    }
    
    

public static void main(String[] args) {
        
}
}
