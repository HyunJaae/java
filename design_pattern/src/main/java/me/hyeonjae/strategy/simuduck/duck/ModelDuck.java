package main.java.me.hyeonjae.strategy.simuduck.duck;

import main.java.me.hyeonjae.strategy.simuduck.fly.FlyNoWay;
import main.java.me.hyeonjae.strategy.simuduck.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("모형 오리 등장!");
    }
}
