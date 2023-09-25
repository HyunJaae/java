package me.hyeonjae;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var randomNames = new String [] {"Jayden", "Bernard", "Zino", "Mason", "Elvin"}[(int) (Math.random() * 5)];
        String name = switch(randomNames) {
            case "Jayden", "jayden" -> {
                System.out.println("Me!");
                yield "제이든";
            }
            case "Bernard", "bernard" -> "버나드";
            case "Zino" -> "자이노";
            case "Mason" -> "메이슨";
            case "Elvin" -> "엘빈";
            default -> "What's your name";
        };

        System.out.println("name = " + name);
    }
}
