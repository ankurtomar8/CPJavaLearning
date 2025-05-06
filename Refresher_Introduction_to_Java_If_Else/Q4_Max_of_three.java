import java.util.Scanner;

public class Q4_Max_of_three {
         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.print(returnMax(A,B,C));
    }
    public static int returnMax(int A,int B,int C){
     
        if(A >= B && A >= C){
            return A;
        } else if(B >= A && B >= C){
            return B;
        }else{
            return C;
        }
    }
}
    

