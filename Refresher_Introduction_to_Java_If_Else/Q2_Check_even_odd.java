import java.util.Scanner;

public class Q2_Check_even_odd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n % 2 != 0) {
            System.out.print("1");
        } else{
            System.out.print("0");
        }
    }
    
}
