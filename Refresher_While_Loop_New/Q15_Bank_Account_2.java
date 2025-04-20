//package Refresher_While_Loop_New;

import java.util.Scanner;

public class Q15_Bank_Account_2 {
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        int result = 0;

        long intialBalance = sc.nextLong();
        int M = sc.nextInt();

        while(M-- > 0){
        int type = sc.nextInt();
        long amount = sc.nextLong();

        if (type == 1) {
            // If type 1, add amount to the balance
            intialBalance += amount;
            System.out.println(intialBalance);
        } else if (type == 2) {
            // Check for insufficient funds before subtracting
            if (intialBalance >= amount) {
                intialBalance -= amount;
                System.out.println(intialBalance);
            } else {
                System.out.println("Insufficient Funds");
                // Continue without breaking the loop
            }
    
            }
         }
    }
}
