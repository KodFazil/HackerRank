package PlusMinus;

import java.util.Scanner;

public class Main {                 // 10 Eylül 2020 < Fazıl >

    static void plusMinus(int[] array) {
        int positive = 0, negative = 0, zero = 0;
        double pratio = 0, nratio = 0, zratio = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }
            else if (array[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        pratio = (float) positive / array.length;
        nratio = (float) negative / array.length;
        zratio = (float) zero / array.length;

        System.out.printf("%.6f \n", pratio);
        System.out.printf("%.6f \n", nratio);
        System.out.printf("%.6f \n", zratio);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        plusMinus(array);
        scanner.close();
    }
}
