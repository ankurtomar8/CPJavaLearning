import java.util.Scanner;

public class Q1_Categorise_the_number_Nested_if_else {
    
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Fizz_Buzz(n);
    }

    public static void Fizz_Buzz(int n){
     
     if(n > 0 && n % 2 == 0){
        System.out.println("Even-Positive");
     }else if( n > 0 && n % 2 != 0){
        System.out.println("Odd-Positive");
     }else if(n < 0 && n % 2 != 0){
        System.out.println("Odd-Negative");
     }else if(n < 0 && n % 2 == 0){
        System.out.println("Even-Negative");
     }

    }

}
