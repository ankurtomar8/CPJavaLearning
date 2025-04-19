import java.util.Scanner;


public class Q1_From_top_to_down {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        int startNumber = 1;

        while(inputNumber > 0 && startNumber <= inputNumber){

            System.out.print(" "+startNumber);
            startNumber++;
        }
        
    }

}
