package FunnyString;

import java.util.Scanner;

public class Main {         // 4 Kasım 2021 < Fazıl >

    static String funnyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int i = 0;
        while (i < s.length() - 1 && Math.abs(s.charAt(i) - s.charAt(i + 1)) == Math.abs(sb.charAt(i) - sb.charAt(i + 1)))
            i++;
        return i == s.length() - 1 ? "Funny" : "Not Funny";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String s;
        for (int i = 0; i < q; i++) {
            s = scanner.next();
            System.out.println(funnyString(s));
        }
    }

}
