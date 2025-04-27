
import java.util.Scanner;

public class Q14_Print_the_Primes {
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);       

        int inputNumber = sc.nextInt();

        // 1 3 5 7 11 13
        for(int i = 1; i <= inputNumber; i++){
            int counter = 0;
            for (int j = 1 ; j <= inputNumber ; j++){

            if(i % j == 0){
                counter++;
                //System.out.println(primeNumber);
            }
        } 
        if(counter == 2){
             System.out.print(" "+i);
        }
     }
    
    }
}
