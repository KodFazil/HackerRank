package CompareTheTriplets;

import java.util.Scanner;

public class Main {             // 9 Eylül 2020 < Fazıl >

    static int[] compareTriplets(int[] a, int[] b) {
        int[] result = new int[2];
        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                result[0]++;
            }
            else if (a[i] < b[i]) {
                result[1]++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Alice = new int[3];
        int[] Bob = new int[3];
        for (int values: Alice) {
            values = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            Bob[i] = scanner.nextInt();
        }
        int[] result = new int[2];
        result = compareTriplets(Alice, Bob);
        for (int i = 0; i < 2; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
