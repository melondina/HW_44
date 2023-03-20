package HW_43;

public class Plane implements CanFly, CanRun, CanSwim{
    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }

    @Override
    public void run() {
        System.out.println("Plane can`t run");
    }

    @Override
    public void swim() {
        System.out.println("Plane can`t swim");

    }
}
