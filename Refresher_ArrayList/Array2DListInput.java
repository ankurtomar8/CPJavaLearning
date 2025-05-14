import java.util.ArrayList;
import java.util.Scanner;


public class Array2DListInput {
    public static void main(String args[]){

        // ArrayList 2D syntax
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<ArrayList<Integer>>();

        Scanner scn = new Scanner(System.in);

        // Basic ops 
        // Add

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1); a1.add(4);
        list2d.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(-6); a2.add(9);
        list2d.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1); a3.add(-9); a3.add(10);
        list2d.add(a3);

        System.out.println(list2d);

        // Get 
       System.out.println(list2d.get(2).get(2));
       System.out.println(list2d.get(2).get(1));

       // Size 
       System.out.println(list2d.size());
       
       // 2 Index  size
         System.out.println(list2d.get(2).size());

         // remove given index
        //  System.out.println(list2d.remove(0));
          System.out.println(list2d.get(2).remove(2));

          // set Array List
           ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(2); a4.add(-9); a4.add(7);
       // update 
      
       list2d.set(0,a4);
       System.out.println(list2d);
       list2d.get(2).set(0,20);
        System.out.println(list2d);

 
    }  
}
