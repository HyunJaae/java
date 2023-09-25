package me.hyeonjae;

public class NullObjectPattern {

    public static void main(String[] args) {
        Member member = new Member();
        member.setName("apple");
        String lowerCase = member.getName().toLowerCase();
        System.out.println("lowerCase = " + lowerCase);
        String string = getString(null);
        System.out.println("string = " + string);
    }

    static class Member {
        private String name;

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public static String getString(String value) {
        return value + "hello";
    }
}
