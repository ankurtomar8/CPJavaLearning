

import java.util.Scanner;

public class Q12_Photo_Frame_Pattern {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 5
              

              // print stars
              for(int stars = 1; stars <= N ; stars++ ){ //8
                System.out.print(" * ");

               
                   // print space
                   for (int space1=stars ; space1 <= N-2; space1++){
                    System.out.print(" "+space1);
                  }
            } 

    
            //change line 
            System.out.println();
        }
    }

}


/*

*****
*   *
*   *
*   *
*****


*/