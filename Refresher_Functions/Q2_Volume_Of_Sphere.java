
import java.util.Scanner;

public class Q2_Volume_Of_Sphere
{
    
    public static int solve(final int A) {

        double PI = Math.PI;

        double area = (4*PI*(A*A*A))/3;

        return (int) Math.ceil(area);

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        System.out.println(solve(N));

    }
}
