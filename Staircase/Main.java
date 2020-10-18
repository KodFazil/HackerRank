package Staircase;

import java.util.Scanner;

public class Main {                  // 10 Eylül 2020 < Fazıl >

    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - 1; k > n - i - 2; k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        staircase(n);
    }
}
