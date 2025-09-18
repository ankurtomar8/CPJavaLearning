import java.util.Scanner;

public class Q5_Low_to_High_II {

    public static String toUpperCase(String str,int n){

        String strNew = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z' ){
                ch = (char)(ch -32) ;

            }

            strNew += ch;

        }
        return strNew;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

       String str = sc.nextLine();
       System.out.println(toUpperCase(str,n));
       
    
    }
    
}
