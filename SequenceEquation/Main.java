package SequenceEquation;

import java.util.Scanner;

public class Main {             // 11 Kasım 2020 < Fazıl >

    static int[] permutationEquation(int[] array) {
        int[] arr = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+1 == array[j]) {
                    index = j + 1;
                    break;
                }
            }
            for (int k = 0; k < array.length; k++) {
                if (array[k] == index) {
                    arr[i] = k + 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = permutationEquation(array);
        for (int values : result) {
            System.out.println(values);
        }
    }
}
