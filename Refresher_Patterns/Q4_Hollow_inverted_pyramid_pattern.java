import java.util.Scanner;

public class Q4_Hollow_inverted_pyramid_pattern {
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
              
                // print stars1
              for (int stars1=1 ; stars1 <= row; stars1++){
                System.out.print("*");
              }
            
                // print space 
               for(int space = N*2-2; space > 2*row-2 ; space-- ){ //8
                System.out.print(" ");
            } 

                // print stars2
            for (int stars2=1 ; stars2 <= row; stars2++){
                System.out.print("*");
              }

            //change line 
            System.out.println();
        }
      
    }
}

/* 

*        *
**      **
***    ***
****  ****
**********
  
 */