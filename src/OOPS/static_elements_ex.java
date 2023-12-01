package OOPS;
public class static_elements_ex {
    int age;
    String name;
    boolean Married;
    static long population;

    public static_elements_ex(int age, String name, boolean married) {
        this.age = age;
        this.name = name;
        this.Married = married;
        static_elements_ex.population +=1;
    }
}
