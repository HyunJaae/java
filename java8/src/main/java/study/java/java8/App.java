package study.java.java8;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        UnaryOperator<String> hi = Greeting::hi;
        System.out.println("hi.apply(\"devlee\") = " + hi.apply("devlee"));
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println("hello.apply(\"devlee\") = " + hello.apply("devlee"));

        Supplier<Greeting> newGreeting = Greeting::new;
        Greeting newGreet = newGreeting.get();



    }
}
