import java.util.Scanner;

public class Q15_Inverted_Full_Pyramid {
    
              public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
              

                // print space
                for (int space1=1 ; space1 < row; space1++){
                    System.out.print(" ");
                  }

           // print stars
            for(int stars = N; stars > row-1 ; stars-- ){ //8
                System.out.print("* ");
            } 
     
            //change line 
            System.out.println();
        }
    }
}
