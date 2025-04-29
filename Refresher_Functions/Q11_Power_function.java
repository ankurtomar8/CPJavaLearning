
import java.util.Scanner;

public class Q11_Power_function {

     public static boolean isPrime(int n){
        int counter = 0;
        for (int i = 1 ; i <= n; i++){
            if(n % i == 0){
               counter++;
            }
        }

        if(counter == 2){
            return true;
        }
        else{
            return false;
        }
    }    

    public static int printEvens(int n){
        int sum = 0;
        for (int i = 1 ; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(" "+i);
                sum += i;
            }
        }
        return sum;

    }

    public static void printPrimes(int n) {
        for(int i = 1; i <= n ; i++){ // pass the iterator
          if(isPrime(i)){
              System.out.println(" "+i);
          }           
        }
   }

   public static int powerFunction(int n, int exponent){
   
    int startNumber = 1;  
    if(exponent == 0){
        System.out.print("1");
    }
    //  2 x 2 x 2
    // 4 x 4 x 4 x 4 
    while(exponent > 0){ // Do with for loop 
        startNumber =  startNumber * n;
        exponent--;
    }
    System.out.print(startNumber);
    return startNumber;
   }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // rows
        int m = sc.nextInt();
   //     printPrimes(n);
    //   int sum = printEvens(n);
    //   System.out.println(" "+sum);
    powerFunction(n,m);

  }
}
