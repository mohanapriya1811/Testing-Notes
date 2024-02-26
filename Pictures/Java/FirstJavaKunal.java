import java.util.Scanner;

public class FirstJavaKunal{

    static boolean oddOrEven(int num){
        if(num%2 == 0)
            return true;
        else
        return false;
    }
    static String greeting(String name){
      String message = "Hi, " +name +" Welcome to Java Programming";  
    return message;

    }

    static int simpleInterest(int p, int t, int r){
        int result = (p* r*t)/100;
        return result;
    }

    static int basicOperations(int num1, int num2, char operater){
    
        int result = 0;
        if(operater == '+'){
            result = num1 + num2;
        }
        else if(operater == '-'){
            result = num1 - num2;
        }
        else if(operater == '*'){
         result = num1 * num2;
        }
         else if(operater == '/'){
          result = num1/num2;        
        } 
                    
      return result;
    }

    static int largestNo(int num1, int num2){
        
        int result = num1>num2 ?num1 :num2;
        return result;

    }
        
    static float rupeeToUsd(int rupee, float usd){
    
    float usdDollar = rupee * usd;
    return usdDollar;    

    }


   static void fibo(int num){

        int num1 = 0;
        int num2 = 1;
        int result = 0;
        int i = 1;
        while(i<num){
            result = num1+num2;
            int temp = result;
            num1 = num2;
            num2 = temp;
            i++;
            System.out.println(num1);
           
        }
    

    }

    static boolean palindrome(String str){
        String newStr = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            newStr += str.charAt(i);
        }
        if(newStr.equals(str))
        return true;
        else
return false;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int num = sc.nextInt();
    //String name = sc.nextLine();
   /* int principal = sc.nextInt();
    int time  = sc.nextInt();
    int rate = sc.nextInt();*/

    //int num1 = sc.nextInt();
    //float num2 = sc.nextFloat();
    //char operater = sc.next().charAt(0);
     // fibo(num1); 
     String str = sc.next();
     System.out.println(palindrome(str));
    
   //System.out.println(rupeeToUsd(num1, num2));
}
}

