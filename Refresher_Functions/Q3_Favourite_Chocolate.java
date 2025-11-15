import java.util.Scanner;

public class Q3_Favourite_Chocolate {
    
    public static int minimumChocolate(int A, int B, int C){
        int affordable = 0;
        
        affordable = A/B;

        if(affordable < C)
        return affordable;
        else
        return C;

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int C = sc.nextInt(); 
       int sum = minimumChocolate(A,B,C);
       System.out.println(" "+sum);
  }
}
