import java.util.Scanner;

public class Count_the_prime {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        for(int i = 0; i <= inputNumber; i++ ){
            int counter = 0;

            for (int j=1 ; j < inputNumber; j++){

                if( i % j == 0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.print(" "+i);
            }    

        }

    }
    
}
