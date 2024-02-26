import java.lang.*;
public class JavaArrayBasic{

static int findSecondLargest(int[] arr){
    int maxOne = Integer.MIN_VALUE;
    int maxTwo = Integer.MIN_VALUE;        
    for(int i = 0; i<arr.length; i++){
        if(arr[i] > maxOne){
         maxTwo = maxOne;
         maxOne = arr[i];         
        }
        else if(arr[i]>maxTwo){
         maxTwo = arr[i];           
        }
    }
   return maxTwo; 
}

static void printTwoDArray(int[][] arr){
    System.out.println(arr.length);
    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++){
           System.out.print(arr[i][j] + " ");        
    }
    System.out.println();
    }
}

static void arrayCopy(int[][] arr){
    
    int row = arr.length;  
    int col = arr[0].length;      
    int[][] newCopy = new int[row][col];

    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++){
           newCopy[i][j] = arr[i][j];  
           System.out.print(newCopy[i][j] + " ");  
    }
    System.out.println();
    }
    
}

/// 123     = temp + sum*10; = 3
//          = 2 + 3*10 = 32
//          = 1 + 32*10   = 321  


static int gcd(int num1, int num2){
int smallNo = num1>num2? num2 : num1;

for(int i = smallNo ; i>0; i--){
    if(num1%i == 0 && num2%i == 0)
        return i;
}
return 1;
}

static int lcm(int num1, int num2){

int highNo = num1>num2?num1 : num2;

while(true){
    if(highNo%num1 == 0 && highNo%num2 == 0){
        break;
    }
    else{
        highNo++;
    }
}
return highNo;
}

static String binaryConversion(int num){
    String bin = "";
    
    while(num>0){
        int temp = num%2;
        num = num/2;
        bin = temp+bin;

}
return bin;
}

static boolean twoArraysEqual(int[] arr1, int[] arr2){
    
    int i = 0;
    if(arr1.length != arr2.length)
       return false;
   
    else{
    while(i<arr1.length){
        if(arr1[i] != arr2[i])
            return false;
        else
        i++;
    }
    }
    return true;
}


static void matrixAddition(int[][] arr1, int[][] arr2)

    int[][] result = new int[arr1.length][arr1[0].length];
    if((arr1.length == arr2.length) && (arr1[0].length == arr2[0].length){  
        
        for(int i = 0; i<arr1.length; i++){
            for(intj = 0; j<arr1.length;j++){
                result[i][j] = arr1[i][j] +arr2[i][j];
                }
        }            
            
        }
    printTwoDArray(result);
    }   
    
public static void main(String[] args){
   // int[] arr = {90, 10, 20, 4, 100};

    //int arr[][] = { { 1, 2, 3, 4 },
    //                   { 5, 6, 7, 8 },
    //                   { 9, 10, 11, 12 } };
    //printTwoDArray(arr);
    //transpose(arr);
    //arrayCopy(arr);
   // System.out.println(findSecondLargest(arr));
   // System.out.println(lcm(24, 36));
   // System.out.println(gcd(15, 20));
    //   octalConversion(540);

    /*int arr1[] = {1, 2, 5, 4, 0, 2};
    int arr2[] = {2, 4, 5, 0}; 
    System.out.println(twoArraysEqual(arr1, arr2));*/

    int A[][] = {{1, 2}, 
                {3, 4}};
    int B[][] = {{1, 1}, 
                {1, 1}};
    
    matrixAddition(A, B);
}
}
