package BreakingTheRecords;

import java.util.Scanner;

public class Main {             // 12 Eylül 2020 < Fazıl >

    static int[] breakingRecords(int[] scores) {
        int min = scores[0], max = scores[0];
        int[] count = new int[2];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                count[0]++;
            } else if (scores[i] < min) {
                min = scores[i];
                count[1]++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int[] result = breakingRecords(scores);
        for (int values: result) {
            System.out.print(values + " ");
        }
    }
}
