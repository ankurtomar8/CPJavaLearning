import java.util.Scanner;

public class Q14_Multiplication_Table {

    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int baseNumber = sc.nextInt();
        int incremental = 1;

        if(incremental == 0){
            System.out.print("0");
        }
        while(incremental <= 10){
            result =  baseNumber * incremental;
            System.out.println(baseNumber+" * "+incremental+" = "+ result);
            incremental++;
        }
    }
}
