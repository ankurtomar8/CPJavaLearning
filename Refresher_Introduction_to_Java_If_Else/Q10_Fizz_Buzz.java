
import java.util.Scanner;

public class Q10_Fizz_Buzz {
    
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Fizz_Buzz(n);
    }

    public static void Fizz_Buzz(int n){
     
     if(n % 3 == 0 && n % 5 == 0){
        System.out.println("FizzBuzz");
     }else if( n % 3 == 0){
        System.out.println("Fizz");
     }else{
        System.out.println("Buzz");
     }

    }
    
}
