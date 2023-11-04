package main.java.me.hyeonjae.strategy.simuduck.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("silence is best!");
    }
}
