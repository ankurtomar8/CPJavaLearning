

import java.util.Scanner;

public class Q3_Inverted_Numeric_Pyramid {
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
           
              // print numbers
              for(int number = 1; number <= N+1-row ; number++ ){
                System.out.print(number);

                if (number < N + 1 - row) {
                    System.out.print(" ");
                }
            }

            //change line 
            System.out.println();
        }
      
    }
}
