import java.util.Scanner;

public class Q3_Is_It_Perfect {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        int T = sc.nextInt();

       
        while(T-- > 0){
        int sum = 0;
        int inputNumber = sc.nextInt();
        int originalNumber = inputNumber;
       
        for(int i = 1; i < inputNumber; i++){
            if(inputNumber % i == 0){
               sum = sum + i;
            }
        }
        if(sum == originalNumber){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
     }
    }
}
