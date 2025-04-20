import java.util.Scanner;

public class Q7_Print_perfect_squares {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int countNumber = 1;
        int inputNumber = sc.nextInt(); 
        int result = 0;

        if(inputNumber == 0){
            return;    
        }

        while(result <= inputNumber){
            result = countNumber*countNumber ;
            if(result > inputNumber ){break;}
            System.out.print(result+" ");
            countNumber++;
        }
        
    }
}
