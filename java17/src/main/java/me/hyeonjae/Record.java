package me.hyeonjae;

public class Record {

    public static void main(String[] args) {
        Person person = new Person("hyunjae", "1234", "Outcome@me.com");
        String email = person.email();
        System.out.println("email = " + email);
    }
}
