package HackerRankInAString;

import java.util.Scanner;

public class Main {             // 1 Kasım 2021 < Fazıl >

    static String hackerrankInString(String s) {
        String pattern = "hackerrank";
        char value = pattern.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length() && count < pattern.length(); i++) {
            if (s.charAt(i) == value) {
                count++;
                if (count < pattern.length())
                    value = pattern.charAt(count);
            }
        }
        return count == pattern.length() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String s;
        for (int i = 0; i < q; i++) {
            s = scanner.next();
            System.out.println(hackerrankInString(s));
        }
    }
}
