package StrangeCounter;

import java.util.Scanner;

public class Main {         // 12 Mayıs 2021 < Fazıl >
            // with this question I'm in gold level
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
