package UtopianTree;

import java.util.Scanner;

public class Main {                // 20 Ekim 2020 < Fazıl >

    static int utopianTree(int n) {
        int height = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                height++;
            }
            else {
                height *= 2;
            }
        }
        return height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] result = new int[t];
        int n;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            result[i] = utopianTree(n);
        }
        for (int values: result)
            System.out.println(values);
    }
}
