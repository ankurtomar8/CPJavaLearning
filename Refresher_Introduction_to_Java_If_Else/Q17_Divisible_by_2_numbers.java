import java.util.Scanner;

public class Q17_Divisible_by_2_numbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
    
        int result = Divisible_by_2_numbers(number);
        System.out.println(result);

    }

    public static int Divisible_by_2_numbers(int number){

        if (number % 11 == 0 && number % 5 == 0){
            return 1;
        }else{
            return 0;
        }

    }
    
}
