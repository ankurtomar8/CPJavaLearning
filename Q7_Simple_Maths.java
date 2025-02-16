import java.util.Scanner;

public class Q7_Simple_Maths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
         int num_a =sc.nextInt();
         int num_b =sc.nextInt();    

        
        // int A =sc.nextInt();
        // int B =sc.nextInt();  


        System.out.println((num_a+num_b)+"\n"+ 
        (num_a-num_b)+"\n"+
        (num_a*num_b)+"\n"+
        ((double) ((num_a/num_b)))
        );


      //  System.out.println((A+B)+" "+(A-B)+" "+(A*B)+" "+(double)((A/B)));
    }
}
