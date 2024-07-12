package Solved_Questions;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> map=new LinkedList<>();

        map.add(1);
        map.add(2);
        map.add(3);

        while(!map.isEmpty()){
            map.removeFirst();
            System.out.println(map);
        }
    }
}
