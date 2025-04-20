import java.util.Scanner;

public class Q11_Sum_of_Odds_Easy {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int startNumber = 1;
        int inputNumber = sc.nextInt();
        int sum = 0;
        while(startNumber <= inputNumber){

          if(startNumber % 2 != 0){
              sum += startNumber;
            }
            startNumber++;

        }
        System.out.print(sum);
    }
}
