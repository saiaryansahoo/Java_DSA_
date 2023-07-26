package OOPS;

public class oops_one {
    public static void main(String[] args) {
//        Student[] students=new Student[5];//new keyword is used for dynamic memory allocation
//        Student Aryan;
//        System.out.println(Student(12,"Aryan",12.4));
//        Student Aryan=new Student();//where Student() is a constructor
//        Aryan.rno=10975;
//        Aryan.name="Aryan";
//        Aryan.marks=8.14f;
        Student Aryan=new Student(13,"Aryan", 42.2f);
        System.out.println(Aryan.rno);
        System.out.println(Aryan.name);
        System.out.println(Aryan.marks);
//        Aryan.changeName("Jeet Sahoo");
//        Aryan.sayhello();

        Student Jeet=new Student();
        System.out.println(Jeet.name);

        Jeet.sayhello();



        final int bonus=2;
        System.out.println(bonus);


    }
}
class Student{
    int rno;
    String name;
    float marks;

    void sayhello(){
        System.out.println("Hey! My name is " + this.name);
    }

//    void changeName(String newName){
//        this.name=newName;
//    }

    Student (){
        this.rno=10975;
        this.name="Aryan Sahoo";
        this.marks=8.14f;
    }

    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
 }
