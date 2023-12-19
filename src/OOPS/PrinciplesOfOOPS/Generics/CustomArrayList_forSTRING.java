package OOPS.PrinciplesOfOOPS.Generics;

import java.util.Arrays;

public class CustomArrayList_forSTRING {
    private String[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList_forSTRING() {
        this.data = new String[DEFAULT_SIZE];
    }

    public void add(String str) {
        if (isFull()) {
            resize();
        }
        data[size++] = str;
    }

    private void resize() {
        String[] temp = new String[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public String remove() {
        String removed = data[--size];
        return removed;
    }

    public String get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList_forSTRING list = new CustomArrayList_forSTRING();

        for (int i = 0; i < 10; i++) {
            list.add("Element " + i);
        }

        System.out.println(list);
    }
}
