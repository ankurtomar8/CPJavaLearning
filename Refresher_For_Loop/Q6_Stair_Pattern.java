import java.util.Scanner;

public class Q6_Stair_Pattern {
    
public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows

        for(int i = 1; i <= N; i++){ // 2 
           
            for(int j = 1 ; j <= i; j++ ){ // 3
                System.out.print("*");
            }
            System.out.println("");
        }
      
    }


    

}
