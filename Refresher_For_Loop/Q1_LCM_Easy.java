
import java.util.Scanner;

public class Q1_LCM_Easy {
    
  public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int inputFirstNumber = sc.nextInt();
        int inputSecondNumber = sc.nextInt();


        for(int i = 1; i <= inputFirstNumber; i++){
            if(inputFirstNumber % i == 0){
                counter++;
            }
        }
        System.out.println(counter);

    }

}
