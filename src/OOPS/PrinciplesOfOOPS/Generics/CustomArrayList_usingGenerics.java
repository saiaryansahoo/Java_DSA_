package OOPS.PrinciplesOfOOPS.Generics;

import java.util.Arrays;

public class CustomArrayList_usingGenerics<T> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList_usingGenerics() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T item) {
        if (isFull()) {
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(Arrays.copyOfRange(data, 0, size)) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList_usingGenerics<String> list = new CustomArrayList_usingGenerics<>();

        for (int i = 0; i < 10; i++) {
            list.add("Aryan" + i);
        }
        System.out.println(list);
    }
}
