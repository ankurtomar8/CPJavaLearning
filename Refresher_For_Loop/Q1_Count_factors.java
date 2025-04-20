import java.util.Scanner;

public class Q1_Count_factors {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int counter = 0;

        int inputNumber = sc.nextInt();

        for(int i = 1; i <= inputNumber; i++){
            if(inputNumber % i == 0){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
