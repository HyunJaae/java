package main.java.me.hyeonjae.strategy.simuduck.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!! Quack!!");
    }
}
