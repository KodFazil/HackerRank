package Pairs;

import java.util.HashSet;
import java.util.Scanner;

public class Main {               // 17 Kasım 2020 < Fazıl >

    static int pairs(int k, int[] array) {
        int pairs = 0;
        HashSet<Integer> hashing = new HashSet<>();
        for (int value : array) hashing.add(value);
        for (int number : hashing) {
            if (hashing.contains(number + k)) {
                pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(pairs(k, array));
    }
}
