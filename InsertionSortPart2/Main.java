package InsertionSortPart2;

import java.util.Scanner;

public class Main {         // 25 Ekim 2021 < Fazıl >

    static void insertionSort2(int n, int[] array) {
        int deger, j;
        for (int i = 1; i < n; i++) {
            deger = array[i];
            j = i - 1;
            while (j >= 0 && deger < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = deger;
            for (int k : array) System.out.print(k + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort2(n, array);
    }
}
