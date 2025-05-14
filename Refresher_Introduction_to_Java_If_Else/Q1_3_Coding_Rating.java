import java.util.Scanner;

public class Q1_3_Coding_Rating {


        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        codingRating(n);
    }

    public static void codingRating(int n){
     
     if(n >= 2100){
        if(n % 2 != 0){
            System.out.println("grand master");
        }else{
            System.out.println("GRAND MASTER");
        }
     }else if( n >= 1900){
        
        if(n % 2 != 0){
            System.out.println("candidate master");
        }else{
            System.out.println("CANDIDATE MASTER");
        }

     } else if( n >= 1600){
        
        if(n % 2 != 0){
            System.out.println("expert");
        }else{
            System.out.println("EXPERT");
        }
     
    } else if( n >= 1400){
        
        if(n % 2 != 0){
            System.out.println("pupil");
        }else{
            System.out.println("PUPIL");
        }
     
    } else  if( n < 1400){
        
        if(n % 2 != 0){
            System.out.println("newbie");
        }else{
            System.out.println("NEWBIE");
        }
     
    }
    

    }
    
}
