
import java.util.ArrayList;
import java.util.Scanner;

public class Q1_Divisible_by_5_and_7 {
     public static ArrayList<Integer> multiples(ArrayList<Integer> arr){

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0 ; i < arr.size();i++){
            int val = arr.get(i);

            if(val % 5 == 0 && val % 7 == 0){
                ans.add(val);
            }

        }
        return ans;

    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

         ArrayList<Integer> arr = new ArrayList<Integer>();
         int n = scn.nextInt();

         for (int i = 0; i < n; i++){
            int tmp = scn.nextInt();
            arr.add(tmp);
         }
        // System.out.println(arr);
          System.out.println(multiples(arr));

    }
}
