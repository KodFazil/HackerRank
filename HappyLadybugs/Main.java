package HappyLadybugs;

import java.util.Scanner;

public class Main {                 // 23 Ekim 2021 < Fazıl >

    static String happyLadybugs(String sb) {
        int underscore = 0, count = 0;
        StringBuilder b = new StringBuilder(sb);
        for (int i = 0; i < b.length(); i++)
            if (b.charAt(i) == '_') underscore++;
        // tamamen boşsa
        if (underscore == b.length()) return "YES";
        // hepsi dolu ve kurala uygun değilse
        if (underscore == 0) {
            for (int i = 1; i < b.length() - 1; i++) {
                if (b.charAt(i) != b.charAt(i - 1) && b.charAt(i) != b.charAt(i + 1)) return "NO";
            }
        }
        // boş yer olsa bile tek eleman varsa
        for (int i = 0; i < b.length(); i++) {
            count = 0;
            if (b.charAt(i) != '_' && b.charAt(i) != '0') {
                count++;
                for (int j = i+1; j < b.length(); j++) {
                    if (b.charAt(i) == b.charAt(j)) {
                        count++;
                        b.setCharAt(j, '0');
                    }
                    //System.out.println(i + " " + b.charAt(i) + " " + b.charAt(j) + "  " + count);
                }
            }
            if (count == 1) return "NO";
        }
        // tek eleman yok ve boş yer de varsa
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        int n;
        String b;
        for (int i = 0; i < g; i++) {
            n = scanner.nextInt();
            System.out.println(happyLadybugs(b = scanner.next()));
        }

    }
}
