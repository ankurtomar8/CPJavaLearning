import java.util.Scanner;

public class Q5_Print_a_matrix_of_stars {
    
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows
        int M = sc.nextInt(); // column


        for(int i = 1; i <= N; i++){ // 2 
           
            for(int j = 1 ; j <= M; j++ ){ // 3
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }
}
