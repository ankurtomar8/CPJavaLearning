
// 1 3 5 7 9

import java.util.Scanner;

public class Q3_Odd_Game {

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);

        int startNumber = 1;

        int inputNumber = sc.nextInt();

        while(startNumber <= inputNumber){

            System.out.print(startNumber+" ");
             startNumber += 2;    

        }
    }
}
