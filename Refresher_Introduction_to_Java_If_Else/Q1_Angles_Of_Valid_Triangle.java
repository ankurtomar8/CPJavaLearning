import java.util.Scanner;

public class Q1_Angles_Of_Valid_Triangle {
    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
       int angleSum = returnAngleSumProperty(A,B,C);
       System.out.println("Sum property" +angleSum);
    }
    public static int returnAngleSumProperty(int A,int B,int C){
        int anglesum = 0;

        if(A == B && B == C && A == C){
            return 1;
        } else if(A != B && B !=C && A != C ){
           anglesum = 180;
           if(anglesum == (A+B+C)){
            return 1;
           }
        }
        else{
            return 0;
        }
        return 0;
    }

}
