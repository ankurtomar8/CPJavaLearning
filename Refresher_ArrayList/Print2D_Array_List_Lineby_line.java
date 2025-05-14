import java.util.ArrayList;
import java.util.Scanner;

public class Print2D_Array_List_Lineby_line {
    

    public static void print2DArrayList(  ArrayList<ArrayList<Integer> > list2d){

        for (int i = 0 ; i < list2d.size();i++){
            // Get the ith arraylist

            ArrayList<Integer> ls = list2d.get(i);

            // Print ith arrayList
            for(int j = 0; j < ls.size(); j++){
                System.out.print(ls.get(j)+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String args[]){

        // ArrayList 2D syntax
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<ArrayList<Integer>>();

        Scanner scn = new Scanner(System.in);

         ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1); a1.add(4);
        list2d.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(-6); a2.add(9);
        list2d.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(1); a3.add(-9); a3.add(10);
        list2d.add(a3);

        print2DArrayList(list2d);
    }
}
