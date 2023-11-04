package main.java.me.hyeonjae;

import main.java.me.hyeonjae.strategy.simuduck.duck.Duck;
import main.java.me.hyeonjae.strategy.simuduck.fly.FlyRocketPowered;
import main.java.me.hyeonjae.strategy.simuduck.duck.MallardDuck;
import main.java.me.hyeonjae.strategy.simuduck.duck.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("===================================");

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}