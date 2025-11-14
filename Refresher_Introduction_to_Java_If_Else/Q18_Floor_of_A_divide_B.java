import java.util.Scanner;

public class Q18_Floor_of_A_divide_B {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
         int second = sc.nextInt();
    
        int result = Floor_of_A_divide_B(first,second);
        System.out.println(result);

    }

    public static int Floor_of_A_divide_B(int first, int second){

       return first/second;

    }
}
