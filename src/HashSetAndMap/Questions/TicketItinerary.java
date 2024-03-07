package HashSetAndMap.Questions;

import java.util.HashMap;

public class TicketItinerary {
    public static void main(String[] args) {
        HashMap<String,String> originalMap=new HashMap<String,String>();
        originalMap.put("Chennai","Bengaluru");
        originalMap.put("Mumbai","Delhi");
        originalMap.put("Goa","Chennai");
        originalMap.put("Delhi","Goa");

        String start=getStart(originalMap);

        while (originalMap.containsKey(start)){
            System.out.print(start+ "->");
            start=originalMap.get(start);
        }
        System.out.print(start);
    }

    public static String getStart(HashMap<String,String> map1){
        HashMap<String,String> reverseMap=new HashMap<String,String>();
        for(String key: map1.keySet()){
            reverseMap.put(map1.get(key),key);
        }


        for(String key:map1.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
