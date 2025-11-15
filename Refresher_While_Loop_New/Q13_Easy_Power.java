import java.util.Scanner;

public class Q13_Easy_Power {
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);

        int startNumber = 1;
        int baseNumber = sc.nextInt();
        int exponent = sc.nextInt();
       
        if(exponent == 0){
            System.out.print("1");
        }
        //  2 x 2 x 2
        // 4 x 4 x 4 x 4 
        while(exponent > 0){
            startNumber =  startNumber * baseNumber;
            System.out.println("Iteration "+startNumber);
            exponent--;
        }
        System.out.print(startNumber);
        
    }
}
