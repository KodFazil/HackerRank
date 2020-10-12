package AppleAndOrange;

import java.util.Scanner;

public class Main {                // 11 Eylül 2020 < Fazıl >

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0, orangesCount = 0;
        for (int i = 0; i < apples.length; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) {
                applesCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            if (oranges[i] + b >= s && oranges[i] + b <= t) {
                orangesCount++;
            }
        }
        System.out.println(applesCount + "\n" + orangesCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] apples = new int[m];
        int[] oranges = new int[n];
        for (int i = 0; i < apples.length; i++) {
            apples[i] = scanner.nextInt();
        }
        for (int i = 0; i < oranges.length; i++) {
            oranges[i] = scanner.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}
