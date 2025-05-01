import java.util.Scanner;

public class Q3_Max_and_Min_of_an_Array {
    

    public static int maxInArray(int arr[] , int n){
               //printing max
               int mx = arr[0];
               for(int i = 0; i < n; i++){ 
                  if(arr[i] > mx){
                    mx = arr[i];
                    }     
                }        
            return mx;
    }

    public static int minInArray(int arr[] , int n){
        //printing max
        int min = arr[0];
        for(int i = 0; i < n; i++){ 
            if(arr[i] < min){
                min = arr[i];
               }     
        }  
            return min;
    }

       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input
        int[] arr = new int[n];
        // array input 
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }   
        System.out.print(maxInArray(arr,n)+" ");       
        System.out.print(minInArray(arr,n)+""); 
  }
}
