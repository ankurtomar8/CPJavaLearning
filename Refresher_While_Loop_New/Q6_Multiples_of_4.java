import java.util.Scanner;
// 20
// 4 8 12 16 20
public class Q6_Multiples_of_4 {
    
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int countNumber = 1;
        int inputNumber = sc.nextInt(); 
        int result = 0;

        if(inputNumber == 0){
            return;    
        }

        while(result <= inputNumber){
            result = countNumber * 4;
            if(result > inputNumber ){break;}
            System.out.print(result+" ");
            countNumber++;
        }
      
        
    }

}
