import java.util.Scanner;

public class array {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n ; i++){
            // take array input here 
            arr[i] = sc.nextInt();
        }

       for (int i = 0; i < n ; i++){
            // take array input here 
            System.out.print(" "+arr[i]);+
        }

         System.out.println(" ");

        // Reverse the array
        for(int i = arr.length-1; i >= 0; i--){
        System.out.print(" "+arr[i]);
        }

    }
}
