package MinimumDistances;

import java.util.Scanner;

public class Main {               // 6 Mayıs 2021 < Fazıl >

    static int minimumDistances(int [] arr) {

        int dist = 0;
        int min = 10000;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dist = j - i;
                    if (dist < min) {
                        min = dist;
                    }
                }
            }
        }
        return min == 10000 ? -1 : min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(minimumDistances(array));
    }
}
