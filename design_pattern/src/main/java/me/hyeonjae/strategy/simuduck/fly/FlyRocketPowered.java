package main.java.me.hyeonjae.strategy.simuduck.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("to infinity and beyond!");
    }
}
