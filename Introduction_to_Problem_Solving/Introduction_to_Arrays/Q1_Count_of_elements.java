import java.util.Scanner;

public class Q1_Count_of_elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
         // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        } 
        int result = countOfElements(n,arr);
         System.out.print(result); 
    }

    public static int countOfElements(int n, int[] arr){
       int max = arr[0];
       int counter = 0;
        for(int i = 0; i < n; i++){ 
            if(arr[i] > max){
                max = arr[i];
            }
         //  System.out.print(arr[i]+" "); 
        } 

         for(int i = 0; i < n; i++){ 
            if(arr[i] == max){
                counter++;
            }
        } 

        return n-counter;
    }
}
