
import java.util.Scanner;

public class Q9_Print_last_digit {
         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        printLastDigit(A);
    }

    public static void printLastDigit(int A){
     
      if (A > 0){
        A = A % 10;
        System.out.println(A);
      }
    }


}
