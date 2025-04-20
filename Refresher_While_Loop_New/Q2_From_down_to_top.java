import java.util.Scanner;

public class Q2_From_down_to_top{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        int startNumber = 1;

        while(inputNumber > 0 && inputNumber >= startNumber){
            
            System.out.print(" "+inputNumber);
            inputNumber--;
        }

    }
}