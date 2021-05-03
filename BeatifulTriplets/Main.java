package BeatifulTriplets;

import java.util.Scanner;

public class Main {               // 3 Mayıs 2021 < Fazıl >

    static int beatifulTriplets(int d, int [] arr) {
        int triplets = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1 && arr[j] <= arr[i] + d; j++) {
                if (arr[j] == arr[i] + d) {
                    for (int k = j + 1; k < arr.length && arr[k] <= arr[j] + d; k++) {
                        if (arr[k] == arr[j] + d) {
                            triplets++;
                        }
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(beatifulTriplets(d, array));
    }
}
