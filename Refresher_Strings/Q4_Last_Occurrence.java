import java.util.Scanner;

public class Q4_Last_Occurrence {
    

     public static int firstOccurance(String str , int b){

        int val = -1;

        for(int i = 0; i < str.length(); i++){
        int ch = str.charAt(i);
            if(ch == b){
            //  System.out.println(ch);
                val = i;
                break;
                
            }
    }
         if (val >= 0){
            return val;
         }
         else{
            return -1;
         }

    }

     public static int lastOccurance(String str , int b){

        int val = -1;

        for(int i = 0; i < str.length(); i++){
        int ch = str.charAt(i);
            if(ch == b){
            //  System.out.println(ch);
                val = i;                
            }
    }
            return val;   

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

   
        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        //System.out.println(isPalin(str));
      //  System.out.print(isPalin("Ankur"));
      // System.out.println(firstOccurance(str,n));
       System.out.println(lastOccurance(str,n));
       
     

    }
}
