import java.lang.*;
import java.util.*;

public class HashSet {

    public static java.util.HashSet<Integer> convertToHashSet(int arr[]){

     java.util.HashSet<Integer> hs = new java.util.HashSet<Integer>() ;

     for (int i = 0 ; i < arr.length; i++){
        hs.add(arr[i]);
     }
    return hs;
    }

    public static void intesect(java.util.HashSet<Integer> hs1,java.util.HashSet<Integer> hs2){
        
        for(Integer ele : hs1){
            if(hs2.contains(ele)){
                System.out.print(ele+" ");
            }
        }

    }

    // Syntax
    //HashSet<Type> hs = new HashSet<Type>();

    public static void main(String args[]){

    java.util.HashSet<Integer> hs = new java.util.HashSet<Integer>() ;
    
        System.out.println(hs);

        // Add
        hs.add(3); hs.add(5); hs.add(-1); hs.add(4); hs.add(0);
        hs.add(1); hs.add(7); hs.add(3);
            
        System.out.println(hs);

        System.out.println(hs.contains(3));
        System.out.println(hs.contains(-15));


    // Print

/*     for (Integer element : hs){
        System.out.println(element);
    } */

    int arr[] = {1,9,7,6,4, 1, -1, 5,6,7,9};
    java.util.HashSet<Integer> hs1 = convertToHashSet(arr);

      int arr2[] = {1,-1,-2,7,6,};
    java.util.HashSet<Integer> hs2 = convertToHashSet(arr2);

   intesect(hs1,hs2);


    }
}
