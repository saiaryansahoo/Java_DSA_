package HashSetAndMap;

import java.util.ArrayList;

//TC: O(1)
//Worst TC:O(n)
public class ImplementationOfHash extends HashMapCode{
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Aryan",1);
        map.put("Bryan",3);
        map.put("Bob",8);

        //System.out.println(map.get("Bob"));
        System.out.println(map.containsKey("n"));
        map.remove("Bob");
        System.out.println(map.get("Bob"));
        System.out.println(map.keySet());
        System.out.println(map.isEmpty());

        ArrayList<String> keys=map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
    }
}

