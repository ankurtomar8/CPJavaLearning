import java.util.Scanner;

public class Q5_Percentage_and_Grade {

         public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        returnMax(A,B,C,D,E);
    }
    public static void returnMax(int A,int B,int C ,int D, int E){
     
        if(A >= 90){
            System.out.println(A);
            System.out.println("A");
        } else if(B >= 80 && B < 90){
            System.out.println(B);
            System.out.println("B");
        }else if(C >= 70 && C < 80){
            System.out.println(C);
            System.out.println("C");
        }else if(D >= 60 && D < 70){
            System.out.println(D);
            System.out.println("D");
        }
        else if(E >= 40 && E < 60){
            System.out.println(E);
            System.out.println("E");
        }
        else{
            System.out.println(A);
            System.out.println("F");
        }
    }
    
}
