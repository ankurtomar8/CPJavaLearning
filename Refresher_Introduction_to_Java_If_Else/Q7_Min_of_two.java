import java.util.Scanner;

public class Q7_Min_of_two {
         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        returnMin(A,B);
    }
    public static void returnMin(int A,int B){
     
        if(A < B){
            System.out.println(A);
        }
        else{
            System.out.println(B);
        }
    }
}
