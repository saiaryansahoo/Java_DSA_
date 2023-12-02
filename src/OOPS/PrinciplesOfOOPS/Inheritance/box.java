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

    box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void running(){
        System.out.println("Successful");
    }
}
