package BetweenTwoSets;

import java.util.Scanner;

public class Main {           // 12 Eylül 2020 < Fazıl >

    static int getTotalX(int[] a, int[] b) {
        int aMax = a[0], bMin = b[0], count = 0, totalNumber = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > aMax) {
                aMax = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] < bMin) {
                bMin = b[i];
            }
        }
        for (int i = aMax; i <= bMin; i++) {
            count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] == 0) {
                    count++;
                }
            }
            for (int k = 0; k < b.length; k++) {
                if (b[k] % i == 0) {
                    count++;
                }
            }
            if (count == a.length + b.length) {
                totalNumber++;
            }
        }
        return totalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(getTotalX(a, b));
    }
}
