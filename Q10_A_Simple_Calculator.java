import java.util.Scanner;

public class Q10_A_Simple_Calculator {
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println((A+B)+" "+(A-B)+" "+(A*B)+" "+(A/B));
        
    }
}
