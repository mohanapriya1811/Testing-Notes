import java.util.Scanner;
public class ConditionalPrograms{
    static int subtractProductAndSum(int num) {
        int sum = 0;
        int product = 1;
        
        while(num != 0){
            int temp = num%10;
            product *= temp;
            sum += temp;
            num = num/10;


        }
    
        return product-sum;
    }

    static void factors(int num){

    for(int i = 2; i<num; i++){
        if(num%i == 0){
            System.out.println(i);
        }
    }
    }

     static int EnterInput(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while(true){
        num = sc.nextInt();
        if(num == 0){
            break;
        }
        else{
        sum = sum+num;
        
    }
    }
    return sum;
}

     static int EnterMax(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int max = 0;
        while(true){
        num = sc.nextInt();
        if(num == 0){
           break;
        }
        else if(num>max){
            max = num;
    }
    }
    return max;
}

    static double circleArea(int r){
        
        return 3.14* r * r;

    }
    
    static double triangleArea(int b, int h){

        return 0.5 * b *h;
    }

    static double rectangleArea(int w, int h){
        return l*w;
    }
    
    
    static double isoscelesTriangle(int side){
        return (Math.sqrt(3))/4 * (side * side);
    }

    static double parallelogram(int b, int h){
        return b*h;
    }

    static double rhombus

    public static void main(String[] args){
    
    //System.out.println(subtractProductAndSum(236));
    //factors(60);
    System.out.println(triangleArea(4, 3));

}

}
