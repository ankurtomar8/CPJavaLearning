import java.util.ArrayList;
import java.util.Scanner;

public class Q2RowAndColumnSums {



    public static ArrayList<Integer> rowAndColSum(ArrayList<Integer> arr){
        ArrayList<Integer> ans = new ArrayList<Integer>();
         for (int i = 0 ; i < arr.size();i++){
            int val = arr.get(i);

            
         }


    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        System.out.println(arr);
        System.out.println(rowAndColSum(arr));
      

    }

}
