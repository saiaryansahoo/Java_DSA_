package OOPS;

import java.util.Arrays;

public class oops_one {
    public static void main(String[] args) {
        Student[] students=new Student[5];

        Student Aryan;
        System.out.println(Arrays.toString(students));
    }
    class Student{
        int rno;
        String name;
        float marks;
    }
}
