import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        int[] arr2 = {-1,2,3,6,5,4,8}; 

        int k = 4; // k times rotation

        int start = 0;
        int end = arr2.length-1;

      //  reverseArray(arr);
    reverseArraySwap(arr2,0,end);

     reverseArraySwap(arr2,0,k-1);

     reverseArraySwap(arr2,k,end);
                         


    }

    public static void reverseArray(int arr[]){
        int n = arr.length;

        for(int i = n-1; i >= 0;i--){
            System.out.print(arr[i]+"  ");
        }

    }

 public static void reverseArraySwap(int arr2[], int start , int end){

    int i = start ; int j = end; // two pointers 
  

    while(i < j){
        
        int temp = arr2[i];
        arr2[i] = arr2[j];
        arr2[j] = temp;

        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr2));

 }


}
