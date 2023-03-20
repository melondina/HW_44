package HW_44;

public class Penguin implements CanSwim, CanRun, CanFly{
    @Override
    public void run() {
        System.out.println("Penguins can run");
    }

    @Override
    public void swim() {
        System.out.println("Penguins can swim");

    }

    @Override
    public void fly() {
        System.out.println("Penguins can`t fly");
    }
}
