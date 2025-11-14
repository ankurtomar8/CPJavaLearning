import java.util.Scanner;

public class Q1_2_Profit_Or_Loss {

    
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
       int angleSum = returnAngleSumProperty(costPrice,sellingPrice);
       System.out.println("Sum property" +angleSum);
    }
    public static int returnAngleSumProperty(int costPrice,int sellingPrice){
      
        if(costPrice < sellingPrice){
            System.out.println(sellingPrice-costPrice);
            return 1;
        } else if(costPrice > sellingPrice ){
        
           System.out.println(costPrice-sellingPrice);
            return -1;
           }
        return 0;
    }
    
}
