import java.util.Scanner;

public class Q6_Full_pyramid {
          public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 5
              
                // print stars1
              for (int space1=N ; space1 > row; space1--){
                System.out.print(" ");
              }
            

               // print space 
               for(int stars = 0; stars <= row-1 ; stars++ ){ //8
                System.out.print("* ");
            } 

          
            //change line 
            System.out.println();
        }
    }
}
