package DivisibleSumPairs;

import java.util.Scanner;

public class Main {              // 12 Eylül 2020 < Fazıl >

    static int divisibleSumPairs(int n, int[] ar, int k) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0 ; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int result = divisibleSumPairs(n, ar, k);
        System.out.println(result);
    }
}
