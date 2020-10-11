package AVeryBigSum;

import java.util.Scanner;

public class Main {               // 9 Eylül 2020 < Fazıl >
    static long aVeryBigSum(long[] array) {
        long sum = 0;
        for (long values: array) {
            sum += values;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }
        long result = aVeryBigSum(array);
        System.out.println(result);
    }
}
