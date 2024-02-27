package HashSetAndMap;

import java.util.HashMap;
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
    }
}
