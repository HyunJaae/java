package study.java.java8;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        System.out.println(multiply2.compose(plus10).apply(2));
        System.out.println("andThen.apply(2) = " + plus10.andThen(multiply2).apply(2));

        BiFunction<Integer, String, String> printAge = (i, s) -> i + s;
        System.out.println("printAge.apply(3, 살) = " + printAge.apply(3, "살"));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println("get10.get() = " + get10.get());

        Predicate<String> startWithDev = (s) -> s.startsWith("dev");
        System.out.println(startWithDev.test("devlee"));
        System.out.println(startWithDev.negate().test("devlee"));

        UnaryOperator<Integer> plus10Unary = (i) -> i + 10;
        System.out.println(plus10Unary.apply(2));

        BinaryOperator<Integer> multiply = (i, j) -> i * j;
        System.out.println(multiply.apply(2, 8));
    }
}
