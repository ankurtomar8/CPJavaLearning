
import java.util.Scanner;

public class Q6_Search_Element {

        public static void copyTheArrayElements(int arr[] , int n, int B){

        for(int i = 0; i < n; i++){ 
           arr[i] = arr[i] + B;    
           System.out.print(arr[i]+" "); 
        }  
            
    }

    public static int searchTheArrayElement(int arr[] , int n, int B){

        for(int i = 0; i < n; i++){ 
           if(arr[i] == B){
            return 1;
           }
        }  
        return 0;
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

    // copyTheArrayElements(arr,n,B);
      int result = searchTheArrayElement(arr,n,B);
      System.out.print(result); 
    }

}
