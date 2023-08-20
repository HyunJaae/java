package study.java.java8;

/**
 * 함수형 인터페이스 정의 시 견고한 관리 가능
 */
@FunctionalInterface
public interface RunSomething {

    void doIt();

    static void printName() {
        System.out.println("HyunJae");
    }

    default void printAge() {
        System.out.println("32");
    }
}
