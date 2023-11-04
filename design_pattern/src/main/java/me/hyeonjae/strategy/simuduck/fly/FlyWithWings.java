package main.java.me.hyeonjae.strategy.simuduck.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly... fly...");
    }
}
