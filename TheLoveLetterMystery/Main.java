package TheLoveLetterMystery;

import java.util.Scanner;

public class Main {         // 9 Kasım 2021 < Fazıl >

    static int loveLetterMystery(String s) {
        int steps = 0;
        for (int i = 0; i < s.length() / 2; i++)
            steps += Math.abs(s.charAt(s.length() - i - 1) - s.charAt(i));
        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String s;
        for (int i = 0; i < q; i++) {
            s = scanner.next();
            System.out.println(loveLetterMystery(s));
        }
    }

}
