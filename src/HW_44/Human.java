package HW_44;

public class Human implements CanSwim, CanRun, CanFly{
    @Override
    public void run() {
        System.out.println("Human can run");

    }

    @Override
    public void swim() {
        System.out.println("Human can swim");

    }

    @Override
    public void fly() {
        System.out.println("Human can`t fly");

    }
}
