import java.util.Scanner;

public class Q6_Which_triangle {
    
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        returnMax(A,B,C);
    }
    public static void returnMax(int A,int B,int C){
     
        if(A == B && B == C && A == C){
            System.out.println("equilateral");
        } else if(A != B && B !=C && A != C ){
            System.out.println("scalene");
        }
        else{
            System.out.println("isosceles");
        }
    }

}
