import java.util.Scanner;

public class Q18_Total_Elapsed_Cooking_Time {
    
    public static void main(String[]  args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int total_time = 2*n+m;
        System.out.println(total_time);

    }


}
