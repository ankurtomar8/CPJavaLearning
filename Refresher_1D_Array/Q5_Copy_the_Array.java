import java.util.Scanner;

public class Q5_Copy_the_Array {
    
    public static void copyTheArrayElements(int arr[] , int n, int B){

        for(int i = 0; i < n; i++){ 
           arr[i] = arr[i] + B;    
           System.out.print(arr[i]+" "); 
        }  
            
    }

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input
        int[] arr = new int[n];
        // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
        
        int B = sc.nextInt(); // input
       // System.out.print(maxInArray(arr,n)+" ");       
        // System.out.print(minInArray(arr,n)+""); 
     //   System.out.print(sumOfArrayElements(arr,n)+""); 

     copyTheArrayElements(arr,n,B);

    }
}
