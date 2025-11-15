import java.util.Scanner;

public class Q17_Print_perfect_squares {

      public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

         Scanner sc = new Scanner(System.in);

        int countNumber = 1;
        int inputNumber = sc.nextInt(); 
        int result = 0;

        if(inputNumber == 0){
            return;    
        }

        while(result <= inputNumber){
            result = countNumber*countNumber ;
            if(result > inputNumber ){break;}
            System.out.print(result+" ");
            countNumber++;
        }

}
