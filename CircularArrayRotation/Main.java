package CircularArrayRotation;

import java.util.Scanner;

public class Main {      // 12 Ekim 2021 < Fazıl >

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int [] result = new int[queries.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = a[(a.length - (k % a.length) + queries[i]) % a.length];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = scanner.nextInt();
        }
        int[] result = circularArrayRotation(a, k, queries);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}