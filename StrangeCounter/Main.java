package StrangeCounter;

import java.util.Scanner;

public class Main {

    static long strangeCounter(long t) {
        long time = 1;
        while (time <= t) {
            time = (time * 2) + 2;
        }
        return time - t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        System.out.println(strangeCounter(t));
    }
}
