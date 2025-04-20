import java.util.Scanner;

public class Q16_Palindromic_Integer {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int remainder = 0;
        int reverse = 0;
        int inputNumber = sc.nextInt();
        int digitPlace = 10;

        int originalNumber = inputNumber;

        if(inputNumber == 0){
            System.out.print("0");
        }
        // 54321
        while(inputNumber > 0){
            remainder = inputNumber % digitPlace;
            inputNumber = inputNumber / digitPlace;
            reverse = (reverse * digitPlace) + remainder; 
          //  System.out.println(reverse);

        }
        
        if(originalNumber == reverse){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }

    }    
}
