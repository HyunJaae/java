package study.java.java8;

public class Foo {

    public static void main(String[] args) {
        RunSomething runSomething = () -> System.out.println("Hello");
        runSomething.doIt();
        runSomething.printAge();
        RunSomething.printName();
    }
}
