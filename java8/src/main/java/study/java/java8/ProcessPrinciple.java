package study.java.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessPrinciple {

    public static void main(String[] args) throws IOException, InterruptedException {

        Process sh = new ProcessBuilder().command("sh", "/Users/devlee/Downloads/test.sh").start();
        int wait = sh.waitFor();
        if (wait == 0) {
            InputStream inputStream = sh.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(inputStreamReader);
            System.out.println("br = " + br.readLine());
        }
        System.out.println("wait = " + wait);
    }
}
