package RepeatedString;

import java.util.Scanner;

public class Main {               // 6 Ekim 2021 < Fazıl >

    static long repeatedString(String s, long n) {
        long count = 0;
        long onlyFirst = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                onlyFirst++;
            }
        }
        count = (n / s.length()) * onlyFirst;
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long n = scanner.nextLong();
        System.out.println(repeatedString(s, n));

    }
}
