import java.util.Scanner;

public class Q2_Insert_that {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input
        int[] arr = new int[n];

        // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
        int X = sc.nextInt(); // input
        int Y = sc.nextInt(); // input

        //printing reverse array
       for(int i = 0; i < n; i++){

        
            System.out.print(arr[i]+" ");
        }      
  }

}
