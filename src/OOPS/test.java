package OOPS;
//revision of OOPs Concepts
public class test {
    public static void main(String[] args) {
        School s1=new School("Aryan",975,"M");

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
    School(String StudentName, int StudentRoll, String StudentGender){
        this.StudentName = StudentName;
        this.StudentRoll=StudentRoll;
        this.StudentGender=StudentGender;
    }
}
