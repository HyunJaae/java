package study.java.java8.standard;

public class Temp {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("HyeonJae");

        System.out.println(box.getItem());
    }
}
