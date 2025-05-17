import java.util.Scanner;

public class Q_11_Beesly_String {
     public static int stringLength(String s){
        int str = s.length();
        return str;
    }

    /* 
     * 
     *  'p','a','m'
     * 
     */


     public static int beeslyString(String str){

        int result = 0 ;
        int countP = 0;
        int countM = 0;

      //  sb.deleteCharAt(2);
    //    System.out.println(sb.toString()); 

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( ch == 'p' || ch == 'a'){
               countP++;
                // to some op
            }
            if(ch == 'm'){
                // to do some op
                countM++;
            }
        

        }
        if(countP == countM){
            return result = 1;
        }else{
            return result;
        }
        

    
    
     }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         sc.nextLine();

        while(T > 0){
            String str = sc.nextLine();
            System.out.print(beeslyString(str));
            //beeslyString(str);
            T--;
        }
        
    }
}
