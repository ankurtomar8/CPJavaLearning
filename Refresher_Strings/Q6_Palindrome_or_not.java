import java.util.Scanner;

public class Q6_Palindrome_or_not {

    public static String reverseNew(String str){
        String strNew = "";

        for(int i = 0 ; i < str.length(); ++i){
            strNew = str.charAt(i) + strNew;
        }

        return strNew ;
    }

    public static boolean isPalin(String str){

        String strComp  = reverseNew(str);

        if(strComp.equals(str)){
            return true;
        }else{
             return false;
        }
        
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while(T-- > 0){

        String str = sc.nextLine();
        System.out.println(isPalin(str));
      //  System.out.print(isPalin("Ankur"));

          }

    }
    
}
