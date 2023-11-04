package main.java.me.hyeonjae.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SwingObserverExample {
    JFrame frame;
    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(e -> {
            Random random = new Random();
            System.out.println(random.nextInt() % 2 == 0 ? "하지마! 아마 후회할 걸?" : "그냥 저질러 버렷!!!");
        });

        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
