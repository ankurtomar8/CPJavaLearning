import java.util.Scanner;

public class Q3_First_Occurrence {
    public static String reverseNew(String str){
        String strNew = "";

        for(int i = 0 ; i < str.length(); ++i){
            strNew = str.charAt(i) + strNew;
        }

        return strNew ;
    }

    public static boolean isPalin(String str){

        String strComp  = reverseNew(str);

        if(strComp.equals(str)){
            return true;
        }else{
             return false;
        }
        
    }


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


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

   
        int n = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        //System.out.println(isPalin(str));
      //  System.out.print(isPalin("Ankur"));
       System.out.println(firstOccurance(str,n));
     

    }
}
