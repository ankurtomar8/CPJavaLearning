import java.util.Scanner;

public class Rough {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result = secondMaxArrayElement(arr);
       System.out.println(result);

       sortedArray(arr);

    }
    public static int secondMaxArrayElement(int[] arr){

        int secondMax =Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

            System.out.println(max);
            System.out.println(secondMax);
    

        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max)
            max = arr[i];  // assign mx value   0  3 , 1 7 , 2 8 , 3 5, 4 6,  5 1, 6 2

        }
           System.out.println(max);

        for (int i = 0; i < arr.length;i++){
            if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
 /// less than max 
        return secondMax;
    }

public static void sortedArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swapArrayElements(arr, j, j + 1);
            }
        }
    }

    // Print sorted array
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
}


    public static void swapArrayElements(int[] arr, int i, int j) {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }

  

}
