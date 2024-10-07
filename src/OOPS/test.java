package OOPS;
//revision of OOPs Concepts
public class test {
    public static void main(String[] args) {
        School s1=new School();
        s1.StudentName="Aryan";
        s1.StudentRoll=975;
        s1.StudentGender="M";

        s1.printInfo();
    }
}

class School{
    String StudentName;
    int StudentRoll;
    String StudentGender;

    public void printInfo(){
        System.out.println(this.StudentName);
        System.out.println(this.StudentRoll);
        System.out.println(this.StudentGender);
    }
}
