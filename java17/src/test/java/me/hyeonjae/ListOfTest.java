package me.hyeonjae;

import org.junit.Test;

import java.util.List;
import java.util.Objects;

public class ListOfTest {

    @Test
    public void createListByListOf() {
        List<String> fruits = List.of("apple", "banana", "kiwifruit");
        for (int i = 0; i < fruits.size(); i++) System.out.println(fruits.get(i));
        for (String fruit : fruits) System.out.println("fruit = " + fruit);
    }

    @Test
    public void testSwitch() {
        String a = "abc";
        String b = switch (a) {
            case "a" -> "one";
            case "abc" -> "String";
            default -> "unknown";
        };
        System.out.println("b = " + b);
    }
}
