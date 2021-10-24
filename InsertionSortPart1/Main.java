package InsertionSortPart1;

import java.util.Scanner;

public class Main {            // 24 Ekim 2021 < Fazıl >

    static void insertionSort1(int n, int [] array) {
        int last = array[array.length - 1];
        int i = array.length - 2;
        while (i >= 0 && last < array[i]) {
            array[i+1] = array[i];
            i--;
            for (int j : array) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        array[i+1] = last;
        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort1(n, array);
    }
}
