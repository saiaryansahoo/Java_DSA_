package OOPS.PrinciplesOfOOPS.Interfaces;

public class car implements Engine, brake,media{

    int a=40;
    @Override
    public void start() {
        System.out.println("Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a normal car");
    }

    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void play() {
        System.out.println("Plays media in car");
    }

    @Override
    public void pause() {
        System.out.println("Pauses media in car");
    }
}
