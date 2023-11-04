package main.java.me.hyeonjae.strategy.simuduck;

import main.java.me.hyeonjae.strategy.simuduck.quack.Quack;
import main.java.me.hyeonjae.strategy.simuduck.quack.QuackBehavior;

public class DuckBeeper {

    public static void main(String[] args) {
        System.out.println("오리 호출기 ON");
        QuackBehavior quack = new Quack();
        quack.quack();
        System.out.println("오리 호출기 OFF");
    }
}
