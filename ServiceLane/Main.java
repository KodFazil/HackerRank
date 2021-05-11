package ServiceLane;

import java.util.Scanner;

public class Main {              // 11 Mayıs 2021 < Fazıl >

    static int [] serviceLane(int [] width, int [][] cases) {
        int min;
        int r, c;
        int [] t = new int[cases.length];
        for (int i = 0; i < cases.length; i++) {
            min = 10000;
            r = cases[i][0];
            c = cases[i][1];
            for (int j = r; j <=c; j++) {
                if (width[j] < min) {
                    min = width[j];
                }
            }
            t[i] = min;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int [] width = new int[n];
        int [][] cases = new int[t][2];
        for (int i = 0; i < n; i++) {
            width[i] = scanner.nextInt();
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                cases[i][j] = scanner.nextInt();
            }
        }
        int [] result = serviceLane(width, cases);
        for (int j : result) {
            System.out.println(j);
        }

    }
}
