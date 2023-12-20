package OOPS.EnumExamples;

public class Main {
    enum  Week{
        Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday

    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;

        for(Week day : Week.values()){
            System.out.println(day);
        }
    }
}
