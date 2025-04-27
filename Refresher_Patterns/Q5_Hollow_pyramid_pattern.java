
import java.util.Scanner;

public class Q5_Hollow_pyramid_pattern {
    
    
        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
              
          System.out.print("*");
        
      
               // print space 
           for(int space = 1; space <= N-row; space++ ){ //8
                System.out.print(" ");
            } 
            System.out.print("*");
         
            //change line 
            System.out.println();
        }
    }
}
