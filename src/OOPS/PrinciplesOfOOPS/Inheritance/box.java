package OOPS.PrinciplesOfOOPS.Inheritance;

public class box {
    double l;
    double h;
    double w;


    box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    box(double length, double height, double weight) {
        this.l = length;
        this.h = height;
        this.w = weight;
    }

    public void running(){
        System.out.println("Successful");
    }
}
