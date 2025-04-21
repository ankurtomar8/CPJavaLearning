import java.util.Scanner;

public class Q4_Print_N_stars {
    
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        for(int i = 1; i <= inputNumber; i++){
                System.out.print("*");
        }
      
    }


}
