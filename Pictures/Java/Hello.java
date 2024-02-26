public class Hello{

    public static void main(String[] args){
                
                //System.out.println(perfectNo(6)); 
                System.out.println(baseToDecimal("1010", 2, 0));
               //System.out.println(lcm(15, 25));
           

        }

    static void printOne(){
    int j = 1;
    for(int i = 1; i<=5; i++){
    System.out.println(j);    
    }
    }

    static void print12345(){
    
    for(int i =1; i<=5; i++){
    System.out.println(i);    
    }
    }

    static void oddPrint(){
        
    for(int i = 1; i<=15; i=i+2){
    System.out.println(i);
    }
    }

    static void printThreeTable(){
    
    for(int i = 1; i<=15; i++){
        System.out.println(i*3);
    }    

    }

    static void threeSeries(){
        
    for(int i =0 ; i<=15; i=i+3){
        System.out.println(i);
    }
        
    }


    static void mulipleOf3And5(){
    
    for(int i = 1; i<=15; i++){
        if(i%3 == 0 && i%5 == 0){
        System.out.println(i);    
    }
    }
    }
    

    static void mulipleOf3Or5(){
    
    for(int i = 1; i<=15; i++){
        if(i%3 == 0 || i%5 == 0){
        System.out.println(i);    
    }
    }
    
    }

    static void divisor(int num){
    int i = 1;
    int count = 0;
    while(i<=num){
        if(num%i == 0){
            System.out.println(i);
            count++;
        }
        i++;
    }
    System.out.println("Count of Divisor: "+ count);
    }

    static boolean perfectNo(int num){
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
    }
    if(num == sum)
        return true;
    else
        return false;

    }
        
    static void perfectSeries(int num){
        for(int i = 1; i<=num; i++){
            if(perfectNo(i)){
                System.out.println(i);
        }
        
    }
        
    }

    static boolean primeNumber(int num){
    int i = 2;
    while(i<num) {       
        if(num%i == 0){
            return false;
        }
       i++;
    }
    return true;
    }

   static boolean primeNum(int num){
    
    for(int i = 2; i<num; i++){
        if(num%i == 0)
            return false;
    }
    return true;
    }

    static void print100Prime(){

    for(int j = 1; j<=100; j++){

        if(primeNum(j))
           System.out.println(j);
           
    }
 
    }

    static int reversePrint(int num){
    int sum = 0;  
    int count = 0; 
    int sumDigit = 0; 
    while(num != 0){
    int temp = num%10; 
    sumDigit += temp; 
    sum = temp + sum*10;   
    num = num/10;     
    count++;
    System.out.print(temp);
        }
    System.out.println();
    System.out.println(count);
    System.out.println(sumDigit);
    return sum;
    }
    
    static boolean palindrome(int num){
     
    int numTwo = reversePrint(num);

    if(numTwo == num)
        return true;
    else
    return false;

    }

    static int countNum(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num/10;
            
        }
        return count;
    }

    static int powerOf(int num, int p){
        int init = 1;
        while(p != 0){
            init = init*num;
            p--;
        }        
       return init;         
    }

    static boolean armstrong(int num){
        
        int product = 0;
        int sum = 0;
        int org =num;
        while(num != 0){
            int countN = countNum(org);
            int temp = num%10;
            product += powerOf(temp, countN);
            num = num/10;       

        }
        if(product == org)
            return true;
         else
            return false;
        }

    static void armstrongSeries(int n){
    for(int i = 1; i<=n; i++){
        if(armstrong(i)){
            System.out.println(i);
        }
        }

    }

    static boolean neonNum(int num){

        int square = num*num;
        int sum = 0;        
        while(square != 0){
            int temp = square%10;
            sum += temp;
            square = square/10;
        }
        if(sum == num)
        return true;
        else
        return false;

    }

    static void neonSeries(int num){
    for(int i = 1; i<=num; i++){
    if(neonNum(i)){
        System.out.println(i);
        }
        }
    
    }
    static void swap(int numOne, int numTwo){
        System.out.println(numOne + " " + numTwo);
        int temp = 0;
        temp = numOne;
        numOne = numTwo;
        numTwo = temp;

        System.out.println(numOne + " " + numTwo);
    }

    static void swapThird(int numOne, int numTwo){
         System.out.println(numOne + " " + numTwo);
        numOne = numOne + numTwo;
        numTwo = numOne - numTwo;
        numOne = numOne - numTwo;

        
        System.out.println(numOne + " " + numTwo);
    }

    static void additionNnumbers(int n){
    int sum = 0;
    for(int i = 1; i<=n; i++){

        sum += i;
    }
    System.out.println(sum);
    }

    static int factorial(int num){
    
        int result = 1;
        while(num != 0){

        result *= num;
        num--;
    }
        return result;
    }

    static boolean strongNum(int num){
    int temp = num;
    int sum = 0;    
    while(temp != 0){
    int lastNum = temp%10;
    sum += factorial(lastNum);
    temp = temp/10;

    }
    if(sum == num)
        return true;
    else
        return false;
    }

    static int  gcd(int numOne, int numTwo){
     
    int smallNo = numOne < numTwo ? numOne : numTwo;
    int max = 0;
    for(int i = 1; i<=smallNo; i++){
    if(numOne%i == 0 && numTwo%i == 0)
        if(max < i){
        max = i;
    }
    } 
    return max;
    }
    
    static int lcm(int numOne, int numTwo){
        int highNo = numOne > numTwo ? numOne : numTwo;
        
        for(int i = numOne ; i<=numOne*numTwo; i++){
            if(i%numOne == 0 && i%numTwo == 0)
                return i;
        }
    return 1;
    }
  

    static int squareValue(int num){

        return num*num;
    }
    
    static boolean sumOfNum(int num){
      int sum = 0;
      while(num !=1 && num != 4){
         sum = 0;      
         while(num >0){
            
            int temp = num%10;
            sum += squareValue(temp); 
            num = num/10;
            System.out.println(sum);
            
        }
    num = sum;
    
    }
        if(sum == 1)
        return true;
        else
        return false;

    }

   
   static double squareRoot(int num){

    double temp;
    double sqt = num/2;

    do{
        temp = sqt;
        sqt = (temp+(num/temp))/2;
    }
    while((temp-sqt)!=0);{
    return sqt;
    }
    
    }
        
   static int multiplyBitwise(int num, int i){

        int result = num<<i;
        return result;

    }

     static int divideBitwise(int num, int i){

        int result = num>>i;
        return result;

    }

    static String decimalToAny(int num, int base){

        String res = "";
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

       

        while(num>0){
            int quotient = num%base;
            num = num/base;
            if(base == 16){
                res = hex[quotient] +res;
            }
            else{
            res = quotient+res;
            }
    }
        return res;
    }

    static int baseToDecimal(String num, int base, int i){

        int no = Integer.parseInt(num);
        i = 0;
        int result = 0;
        int baseProduct = 1;
        while(no>0){

            int temp = no%10;
            int j = i;
            baseProduct = 1;
            while(j>0){
                baseProduct *=base;
                j--;
            }
            
            result += temp * baseProduct;
            no = no /10;
            i++;
        }
        
        return result;
    }
}


