import java.util.Scanner;

public class Q1_Length_of_String {

    public static int stringLength(String s){
        int str = s.length();
        return str;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();

        while(T > 0){
            String str = sc.nextLine();
            System.out.print(stringLength(str));
            T--;
        }
        
    }
}
