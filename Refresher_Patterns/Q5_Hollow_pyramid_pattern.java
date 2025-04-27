
import java.util.Scanner;

public class Q5_Hollow_pyramid_pattern {
    
    
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
              
                // print stars1
              for (int stars1=N ; stars1 >= row; stars1--){
                System.out.print("*");
              }
            

               // print space 
               for(int space = 1; space <= 2* (row-1) ; space++ ){ //8
                System.out.print(" ");
            } 

                // print stars2
            for (int stars2=N ; stars2 >= row; stars2--){
                System.out.print("*");
              }

            //change line 
            System.out.println();
        }
    }
}
