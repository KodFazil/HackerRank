package SuperReducedString;

import java.util.Scanner;

public class Main {         // 24 Ekim 2021 < Fazıl >

    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int j;
        for (int i = 0; i < sb.length() - 1; i=j) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.delete(i, i+2);
                if (i == 0) j = i; else j = i - 1;
            } else j = i + 1;
        }
        return sb.length() == 0 ? "Empty String" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();;
        System.out.println(superReducedString(s));
    }
}
