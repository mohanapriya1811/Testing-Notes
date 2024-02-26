import java.util.Scanner;
import java.util.Arrays;
public class FunctionConcept{
    

    static int maxNo(int num1, int num2, int num3){

        int max = 0;
       if(num1>num2 && num1>num3){
            max = num1;            
                      
       }
       else if(num2>num3){
        max = num2;
       }
       else{
        max = num3;
        }
        return max;
    }
    
     static int minNo(int num1, int num2, int num3){

        int min = Integer.MIN_VALUE;
       if(num1<num2 && num1<num3){
            min = num1;            
                      
       }
       else if(num2<num3){
        min = num2;
       }
       else{
        min = num3;
        }
        return min;
    }


    static boolean oddOrEven(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;

    }

    static boolean rightToVote(int age){
        if(age>=18)
            return true;
        else
            return false;

    }

    static int sumOfTwo(int num1, int num2){

        int sum = num1 + num2;
        return sum;

    }

     static int productOfTwo(int num1, int num2){

        int product = num1 * num2;
        return product;

    }

    static double[] areaAndPerimeter(int r){

        double area = 0;
        double perimeter = 0;

        area = 3.14 * r * r;
        perimeter = 2 * 3.14 * r;
        return new double[]{area, perimeter};
    }

    static boolean primeOrNot(int num){
        int count = 2;
        while(count<num){
            if(num%count == 0){
                return false;            
            }
            else{
                count++;
            }
                
        }
        return true;
    }

    static String giveGrade(int mark){
       
       if(mark>90 && mark<101)
        return "AA";
       else if(mark>80 && mark<91)
        return "AB";
       else if(mark>70 && mark<81)
        return "BB";
       else if(mark>60 && mark<71)
        return "BC";
       else if(mark>50 && mark<61)
        return "CD";
       else if(mark>40 && mark<51)
        return "DD";
       else if(mark<=40)
        return "fail";
       else
        return "Invalid mark";
    
    }

    static boolean pythagoreanTriplets(int a, int b, int c){
        
        int sum = 0;
        
        sum = (a * a) + (b * b);
        if(sum == (c*c))
            return true;
        else
            return false;

    }

    static void printAllPrimeOfTwo(int num1, int num2){

        for(int i = num1; i<=num2; i++){
            if(primeNo(i))
                System.out.println(i);
        }

    }

    static boolean primeNo(int num){
        
        for(int i = 2; i<num; i++){
            if(num%i == 0)
                return false;        
        }
        return true;

    }

    static int sumOfNaturalNos(int num){
        return (num* (num+1))/2;
      }

      static void factorial(int num){
        int fact = 1;
        String output = num +"! = ";
        while(fact<num){
            fact *= fact;
            output = output +  fact +"*"; 
            fact++;
            
            

        }
        System.out.println(output + " = "+ fact );
       }
public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    //int num2 = sc.nextInt();

    //int a = sc.nextInt();
    //int b = sc.nextInt();
    //int c = sc.nextInt();
    //System.out.println(sumOfNaturalNos(num));
    factorial(num);
}

}
