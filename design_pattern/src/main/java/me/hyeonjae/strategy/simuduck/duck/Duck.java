package main.java.me.hyeonjae.strategy.simuduck.duck;

import main.java.me.hyeonjae.strategy.simuduck.fly.FlyBehavior;
import main.java.me.hyeonjae.strategy.simuduck.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim... swim...");
    }

    public void display() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
