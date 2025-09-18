import java.util.Scanner;
// Incomplete
public class Q8_Confusion_In_Electricity_Bill {
    
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // unit
        Confusion_In_Electricity_Bill(n);
    }

    public static void Confusion_In_Electricity_Bill(int n){
     
     if(n >= 50 ){     
       n = (int) (0.5 * n); 
        System.out.println(n);
     }else if( n > 50 && n <=100){
      n = (int) (0.75 * n);
      System.out.println(n);
     }else if(n > 100 && n <= 250){
      n = (int) (1.20 * n);
      System.out.println(n);
     }else if(n > 250 ){
      n = (int) (1.50 * n);
      System.out.println(""+n);
     }

    }
}
