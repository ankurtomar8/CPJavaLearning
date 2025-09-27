import java.util.Scanner;

public class Q3_Copy_The_String {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String sNew = "Hello World";

        String aNew = "";

        for (int i = 0; i < sNew.length()-1 ;i++){
            aNew =  aNew + sNew.charAt(i);
        }

      System.out.println("sNew "+ sNew);
      System.out.println("aNew "+ aNew);


    }
}
