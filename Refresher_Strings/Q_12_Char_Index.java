import java.util.Scanner;

public class Q_12_Char_Index {
   
     public static String charIndex(String str){

        String result = "";
        for(int i = 0 ; i < str.length(); i++){
            result = result+str.charAt(i)+((str.charAt(i)-96));
        }
        return result;

    }  


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();

        while(T > 0){
            String str = sc.nextLine();
            System.out.print(charIndex(str));
            //beeslyString(str);
            T--;
        }
        
    }
}
