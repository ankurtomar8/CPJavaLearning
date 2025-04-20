import java.util.Scanner;

// 1+2+3+4+5 = 15

public class Q5_Summation_Game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int startNumber = 1;
        int inputNumber = sc.nextInt(); 
        int sum = 0;

        while(startNumber <= inputNumber){
            sum += startNumber;
            startNumber++;
        }
        System.out.print(sum);
        
    }
}
