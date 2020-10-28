package ElectronicShop;

import java.util.Scanner;

public class Main {              // 15 Eylül 2020 < Fazıl >

    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int total = 0, max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= budget) {
                    total = keyboards[i] + drives[j];
                    if (total > max) {
                        max = total;
                    }
                }
            }
        }
        if (max == 0) {
            return -1;
        }
        else {
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] keyboards = new int[n];
        int[] drives = new int[m];
        for (int i = 0; i < n; i++) {
            keyboards[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            drives[j] = scanner.nextInt();
        }
        System.out.println(getMoneySpent(keyboards, drives, b));
    }
}
