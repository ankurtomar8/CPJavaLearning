import java.util.Scanner;

public class Q2_Is_It_Prime {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        long inputNumber = sc.nextLong();

        for(long i = 1; i <= inputNumber; i++){
            if(inputNumber % i == 0){
                counter++;
            }
        }
        if(counter == 2){ // Number is prime if it has exactly two factors 
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
