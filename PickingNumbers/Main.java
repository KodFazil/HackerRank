package PickingNumbers;

import java.util.Scanner;

public class Main {                   // 19 Ekim 2020 < Fazıl >

    static int pickingNumbers(int[] array) {
        int max = 2, moreMax = 0;
        for (int i = 0; i < array.length; i++) {
            moreMax = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] || array[i] == array[j] + 1) {
                    moreMax++;
                }
            }
            if (moreMax > max) {
                max = moreMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(pickingNumbers(array));
    }
}
