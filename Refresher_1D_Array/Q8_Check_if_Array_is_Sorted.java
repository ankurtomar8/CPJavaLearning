import java.util.Arrays;
import java.util.Scanner;

public class Q8_Check_if_Array_is_Sorted {

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

    public static int frequencyOfXInArray(int arr[] , int n, int B){

        int counter = 0;
        for(int i = 0; i < n; i++){ 
           if(arr[i] == B){
            counter++;
           }
        }  
        return counter;
    } 

    public static int checkifArrayisSorted(int arr[] , int n){

        for(int i = 0; i < n-1; i++){ 
           
           if(arr[i] > arr[i+1]){
          //  System.out.print(arr[i]+" "); 
          return 0;
           }
          
        }  
        return 1;
    } 

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt(); // input
        int[] arr = new int[n];
        // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
           
      int result = checkifArrayisSorted(arr,n);
      System.out.print(result); 
    }

    
}
