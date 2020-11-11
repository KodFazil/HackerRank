package FindDigits;

import java.util.Scanner;

public class Main {                // 11 Kasım 2020 < Fazıl >

    static int findDigits(int n) {
        int number = 0, digit, realNumber = n;
        while (n > 0) {
            if (n % 10 != 0) {
                digit = n % 10;
                if (realNumber % digit == 0) {
                    number++;
                }
            }
            n /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] array = new int[t];
        int n;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            array[i] = findDigits(n);
        }
        for (int values : array) {
            System.out.println(values);
        }
    }
}
