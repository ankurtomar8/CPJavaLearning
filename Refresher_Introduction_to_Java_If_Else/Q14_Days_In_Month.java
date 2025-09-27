import java.util.Scanner;

public class Q14_Days_In_Month {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

       int result =  dayInMonth(A);
        System.out.println(result);
    }
    public static int dayInMonth(int A){
        switch(A){
            case 1: case 4: case 6: case 9: case 11:
            return 30;
            
            case 2: 
            return 28;
            

            case 3: case 5:  case 7: case 8:  case 10: case 12:
            return 31;
            
            default:
            return 0;
            

        }
    }

}
