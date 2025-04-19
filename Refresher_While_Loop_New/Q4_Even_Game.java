

// 2 4 6 8 10
import java.util.Scanner;

public class Q4_Even_Game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int startNumber = 0;

        int inputNumber = sc.nextInt();

        while(startNumber <= inputNumber){

            System.out.print(startNumber+" ");
             startNumber += 2;    

        }
    }
}

