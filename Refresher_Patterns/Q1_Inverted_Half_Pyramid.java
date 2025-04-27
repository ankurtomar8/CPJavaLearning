
import java.util.Scanner;

public class Q1_Inverted_Half_Pyramid {
        
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int row = 1; row <= N; row++){ // 2 
           
            for(int col = 1 ; col <= row; col++ ){ // 3

                if(col % 2 == 1){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
      
    }

}
