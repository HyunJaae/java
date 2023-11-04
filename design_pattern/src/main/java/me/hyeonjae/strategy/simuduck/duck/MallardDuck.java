package main.java.me.hyeonjae.strategy.simuduck.duck;

import main.java.me.hyeonjae.strategy.simuduck.fly.FlyWithWings;
import main.java.me.hyeonjae.strategy.simuduck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리 탄생!");
    }
}
