import java.util.Scanner;

public class Q2_Insert_that {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input
        int[] arr = new int[n+1]; // for extra space

        // array input 
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
        int X = sc.nextInt(); // input
        int Y = sc.nextInt(); // input

      
        // Shift elements to the right from position X-1
        for (int i = n; i >= X; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert Y at position X-1 (0-based index)
        arr[X - 1] = Y;

        // Print the updated array
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
     
  }

}
