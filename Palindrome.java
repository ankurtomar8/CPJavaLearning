import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        String str = "NITIN"; // empty string

        int n = str.length();
        String strNew = "";

        int[] reverse = new int[n]; // reverse

         for(int i = 0; i <str.length(); i++){
             strNew = str.charAt(i)+strNew;

         }

        //boolean result = isPalindrome();
        System.out.println(isPalindrome(str, strNew));

    }

    public static boolean isPalindrome(String plaindromeCheck,String reverse){
        // calulate logic 
    
          if (plaindromeCheck.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    
}
