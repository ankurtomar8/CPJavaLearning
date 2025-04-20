import java.util.Scanner;

public class Q10_Sum_the_digits {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
          
        int T = sc.nextInt(); 
        while(T > 0)    
      {
        int inputNumber = sc.nextInt();
        int sum = 0;

        if(inputNumber == 0 || inputNumber == 1){
            System.out.println("1");
        }
        else{
        while(inputNumber > 0){
          int Digit = inputNumber % 10;
            inputNumber = inputNumber/10;
            sum +=Digit;
        }
        System.out.println(sum);
    }    
        T--;
    }
 }
}
