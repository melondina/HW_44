package HW_43;

public class Duck implements CanRun, CanSwim, CanFly{
    @Override
    public void fly() {
        System.out.println("Ducks can fly");
    }

    @Override
    public void run() {
        System.out.println("Ducks can run");
    }

    @Override
    public void swim() {
        System.out.println("Ducks can swim");
    }
}
