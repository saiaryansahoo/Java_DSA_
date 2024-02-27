package HashSetAndMap;

import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        map.put("Aryan",21);
        map.put("Jeet",20);
        map.put("Ari",21);
        map.put("Aryan",22);

        System.out.println(map);

        System.out.println(map.size());

        if(map.containsKey("Sahoo")) System.out.println("Yes presen in the map");
        else System.out.println("Not present in the map");

        System.out.println(map.get("Aryan"));

        System.out.println(map.entrySet());

        for(Map.Entry<String,Integer> e:map.entrySet())
            System.out.println("Name is: "+ e.getKey() + " And" +" Age = "+ e.getValue());


        Set<String> keys=map.keySet();
        for (String key : keys) System.out.print(key+" "+map.get(key)+" ");
        System.out.println();

        map.remove("Aryan");
        System.out.println(map);
    }
}
