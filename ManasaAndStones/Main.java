package ManasaAndStones;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {                 // 15 Ekim 2021 < Fazıl >

    static int[] stones(int n, int a, int b) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int small = Math.min(a, b);
        int big = Math.max(a, b);
        int differ = (big - small);
        int min = small * (n - 1);
        int max = big * (n - 1);
        int current = min;
        if (small == big)
            arrayList.add(min);
        else {
            while (current <= max) {
                arrayList.add(current);
                current += differ;
            }
        }
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n, a, b; // test cases, stones, differences
        t = scanner.nextInt();
        int[][] resultArray = new int[t][];
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            a = scanner.nextInt();
            b = scanner.nextInt();
            resultArray[i] = stones(n, a, b);
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

