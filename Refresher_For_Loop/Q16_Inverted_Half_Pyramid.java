

import java.util.Scanner;

public class Q16_Inverted_Half_Pyramid {
        
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int i = 1; i <= N; i++){ // 2 
           
            for(int j = N ; j >= i; j-- ){ // 3
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }



}
