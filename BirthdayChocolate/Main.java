package BirthdayChocolate;

import java.util.Scanner;

public class Main {            // 12 Eylül 2020 < Fazıl >

    static int birthday(int[] s, int d, int m) {
        int count = 0, control = 0;
        for (int i = 0; i < s.length - m + 1; i++) {
            control = 0;
            for (int j = i; j < m + i; j++) {
                control += s[j];
            }
            if (control == d) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(birthday(s, d, m));
    }
}
