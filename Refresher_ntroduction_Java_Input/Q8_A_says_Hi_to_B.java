package Refresher_ntroduction_Java_Input;
import java.util.Scanner;

public class Q8_A_says_Hi_to_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String Astring = sc.nextLine();
        String Bstring = sc.nextLine();

        System.out.println(Astring+" says Hi to "+Bstring);

    }
}
