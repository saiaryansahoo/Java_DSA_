package Solved_Questions;

import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution(anagrams);

        System.out.println(result);
    }
    public static List<List<String>> solution(String[] strs){
        Map<String,List<String>> groups = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groups.computeIfAbsent(key, value -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
