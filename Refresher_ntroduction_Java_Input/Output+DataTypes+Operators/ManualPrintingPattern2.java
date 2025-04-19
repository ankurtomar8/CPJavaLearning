package Refresher_ntroduction_Java_Input;
import java.util.Scanner;

public class ManualPrintingPattern2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       
        String string = sc.nextLine();
        
        System.out.println("Hello World "+ string);

       sc.close();
    }
}
