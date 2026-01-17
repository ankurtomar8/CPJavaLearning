
import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class HashSetNew {
    public static void main(String[] args){

        Set<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);

        System.out.println(hs);

        hs.forEach((n)->{System.out.println(n);});


     //   java.util.HashMap<Integer> mp = new java.util.HashMap<Integer>();

     Map<Integer,String> mp = new HashMap<>();

        mp.put(1,"India");
        mp.put(2,"Delhi");
        mp.put(3,"Vscode");
        mp.put(4,"not know");

        System.out.println(mp);
        System.out.println(mp.get(2));

    for (Map.Entry<Integer, String> entry : mp.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}

    for (String value : mp.values()) {
    System.out.println("Value: " + value);
    }

    }
}
