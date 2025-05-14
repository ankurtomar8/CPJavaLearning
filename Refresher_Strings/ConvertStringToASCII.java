
public class ConvertStringToASCII {


    public static int countSpecial(String s){

        /* 
         *  not uppercase
         *  not lowercase 
         * not numeric  
         * 
         */

         int count = 0;

         for(int i = 0; i < s.length(); ++i){

            char ch = s.charAt(i);
            if(
                !(ch >='A' && ch <= 'Z') &&
                !(ch >='a' && ch <= 'z') &&
                !(ch >='1' && ch <= '9') 
            ){
                count++;
            }

         }
         return count;
    }


    public static String reverse(String s){

        /* str = "" 
        str = "A" + "" = "A"
        str = "n" + "r" = "nA"
        str = "k" + "ru" = "knA"
        str = "u" + "ruk" = "uknA"
        str = "r" + "rukn" = "ruknA"
 */

    String str = "";
    for(int i = 0; i < s.length(); ++i){
        str = s.charAt(i) + str;
    } 
    return str;  

    }


/* 
 * Check if String is palindrome or not 
 * 
 * 
 */

 public static boolean stringPalindrome(String s){

    String rev = reverse(s);
    if(s.equals(rev)){
        return true;
    }
        return false;
 }

 /* 
  *
      Categorized password strength 
      low - if only alphabets or length < = 8

      moderate - if alpabets and numbers and length > 8

      high - if aplphabets and numbers and special chars and length > 8   

  */


  public static String passwordStrength(String str){
    /* 
     * 1 - length of string
     * 2- number of alphabets
     * 3- number of numerics
     * 4- number of special chars
     * 
     */
    int len = str.length();
    int a = 0, n = 0, s = 0; 
    /* 
     a --> alpabets
     n --> numeric
     s ---> Special chars
    */

    for(int i = 0; i < str.length(); i++){
        int ch = str.charAt(i);

        if(ch  >= 'A' && ch <= 'Z'){
            ++a;
        }else  if (ch  >= 'a' && ch <= 'z'){
            ++a;
        } else if (ch  >= '0' && ch <= '9'){
            ++n;
        }else{
            ++s;
        }
    }
    if (len <= 8){
        return "low";
    }else if(a > 0 && n == 0 && s == 0){
        return "moderate";
    } else if(a > 0 && n > 0 && s == 0){
        return "moderate";
    }else if(a > 0 && n > 0 && s > 0){
        return "high";
    }
    return "low";

  }



    public static void main(String args[]){

        String country = "India";

        for(int i = 0; i < country.length();++i)
        {   
            //System.out.println(country.charAt(i));
              //       System.out.print(" "+(int)country.charAt(i));
            
        }
        
        int count = 0;

        String random = "SDKjbsv9_8B/rklnjU";

        for(int i = 0; i < random.length();i++){
            int val = random.charAt(i);
            if (val >= 65 && val <= 90){
                  System.out.print(" "+random.charAt(i));
                ++count;
            }
        }
        System.out.println(count);

        // String  : "SDl@jb sv9_8/r1dU"

        // output 4 ['@', ' ','_','/']
         String random1 = "SDl@jb sv9_8/r1d";
        System.out.println(countSpecial(random1));

        String s1= "Ankur";
        System.out.println(reverse(s1));


        /* 
         * 
         * Object1 == Object2 ----> false
         *  Integer1 == Integer2 ---> false
         * 
         * equals()
         */

          String s2= "namaN";
        System.out.println(stringPalindrome(s2));

          
         System.out.println(passwordStrength("@2d2"));
         System.out.println(passwordStrength("12345"));
         System.out.println(passwordStrength("ASDKLnklsdk"));
         System.out.println(passwordStrength("@asn213nas@$mndasSD123"));


    }
    
}
