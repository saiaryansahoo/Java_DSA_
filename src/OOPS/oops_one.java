package OOPS;

import java.util.Arrays;

public class oops_one {
    public static void main(String[] args) {
//        Student[] students=new Student[5];//new keyword is used for dynamic memory allocation

//        Student Aryan;
//        System.out.println(Student(12,"Aryan",12.4));

        Student Aryan=new Student();
        Aryan.rno=10975;
        Aryan.name="Aryan";
        Aryan.marks=8.14f;
        System.out.println(Aryan.rno);
        System.out.println(Aryan.name);
        System.out.println(Aryan.marks);
    }
}
class Student{
    int rno;
    String name;
    float marks;
}
