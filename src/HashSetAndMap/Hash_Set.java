package HashSetAndMap;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();

        hash.add(2);
        hash.add(4);
        hash.add(6);
        hash.add(8);

//        hash.remove(2);

        if(hash.contains(2)) System.out.println("Set contains 1 :)");
        else System.out.println("Doesn't contain 1 :(");

        System.out.println("Size of Set is: "+hash.size());

        System.out.println("The elements in the Set are: "+ hash);

        Iterator it=hash.iterator();

//        System.out.println(it.next());

        while(it.hasNext()) System.out.println(it.next());

//        for (Integer integer : hash) System.out.println(integer);
    }
}
