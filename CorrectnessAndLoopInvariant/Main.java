package CorrectnessAndLoopInvariant;

import java.util.Scanner;

public class Main {        // 29 Ekim 2021 < Fazıl >

    static void insertionSort(int [] array) {
        int key, j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
    }

}
