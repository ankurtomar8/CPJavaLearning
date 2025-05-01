import java.util.Scanner;

public class Q1_Print_in_Reverse {

/*  TODO:

public static void reverseArray(){} */ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input
        int[] arr = new int[n];

        // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
        //printing reverse array
        for(int j = n-1; j >=0 ; j--){
            System.out.print(arr[j]+" ");
        }        
  }
}
