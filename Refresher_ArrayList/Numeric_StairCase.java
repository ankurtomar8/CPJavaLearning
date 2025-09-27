

/* 
 *      [1]
 *      [1 2]
 *      [1 2 3]   
 *          
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Numeric_StairCase {
   
      public static ArrayList<ArrayList<Integer> > staircase(int n){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        // if row [1]
        // if row 2 -> [1 , 2]

        for (int row = 1 ; row <= n; row++){
            // Get the ith row arraylist element
            
            ArrayList<Integer> rw = new ArrayList<Integer>();
            // Print ith col arrayList
            for(int col = 1; col <= row; col++){
               rw.add(col);
            
            }
       //     System.out.println("");
           ans.add(rw);
          
        }
        return ans;
    }



    public static void main(String args[]){

        // ArrayList 2D syntax
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<ArrayList<Integer>>();

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

         ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1); a1.add(4);
        list2d.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(-6); a2.add(9);
        list2d.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1); a3.add(-9); a3.add(10);
        list2d.add(a3);

        System.out.println(staircase(n));
        
    }


}
