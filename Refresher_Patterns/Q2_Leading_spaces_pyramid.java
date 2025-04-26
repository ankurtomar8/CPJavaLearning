

import java.util.Scanner;

public class Q2_Leading_spaces_pyramid {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
           
            // print spaces
            for(int sp = 1 ; sp <= N-row; sp++ ){ // 3 // exact logic col <= N+1-row;
                System.out.print(" ");
            }

            // print stars
            for(int stars = 1; stars <= row ; stars++ ){
                System.out.print("*");
            }

            //change line 
            System.out.println();
        }
      
    }
}
