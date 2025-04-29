
import java.util.Scanner;

public class Q1_Area_of_Circle {
    
    public static double solve(int A) {
        
        double PI = 3.1416;

        double area = PI*(A*A);
    
        area = Math.round(area *100.0)/100.0; // check method round 
        return area;

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

        System.out.println(solve(N));

    }
}
