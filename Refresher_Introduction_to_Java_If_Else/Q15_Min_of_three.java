import java.util.Scanner;

public class Q15_Min_of_three {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int result = minOfThree(first,second,third);
        System.out.println(result);

    }

    public static int minOfThree(int first,int second,int third){

        if(first < second && first < third)
         return first;
         else if (third < second && third < first)
         return third;
         else 
         return second;

    }


}
