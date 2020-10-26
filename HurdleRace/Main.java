package HurdleRace;

import java.util.Scanner;

public class Main {                   // 18 Ekim 2020 < Fazıl >

    static int hurdleRace(int k, int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        if (k >= max) {
            return 0;
        }
        else {
            return max - k;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        System.out.println(hurdleRace(k, heights));
    }
}
