import java.util.Scanner;

public class Q8_First_vs_Last {
      public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
      
      
        int T = sc.nextInt(); 
        while(T > 0)    
      {
        int inputNumber = sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = inputNumber % 10;
        while(inputNumber > 0){
            firstDigit = inputNumber % 10;
            inputNumber = inputNumber/10;
        }
        System.out.println(firstDigit+" "+lastDigit);
        T--;

    }
 }
}
