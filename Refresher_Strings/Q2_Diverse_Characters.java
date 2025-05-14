import java.util.Scanner;

public class Q2_Diverse_Characters {
    

    public static int Diverse_Characters(String str){

        int alphabets  = 0; int countAlpa = 0;int digits  = 0;int countDigi = 0;

        for (int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);

            if( ch >= 'A' && ch <= 'z'){
             countAlpa++;
             alphabets  = countAlpa;
            } else if(ch >= '0' && ch <= '9'){ 
             countDigi++;
             digits  = countDigi;
            }

        }

        if(alphabets > digits ){
             return alphabets;

        } else {
             return digits;
        }
    }

        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       // int T = sc.nextInt();
         //sc.nextLine();
        String str = sc.nextLine();
        System.out.println(Diverse_Characters(str));
        
    }


}
