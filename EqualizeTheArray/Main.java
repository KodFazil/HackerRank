package EqualizeTheArray;

import java.util.Scanner;

public class Main {             // 10 Mart 2021 < Fazıl >

    static int equalizeArray(int[] array) {
        int count = 0, max = 0, maxI = 0;
        int[] hashArray;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        hashArray = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            hashArray[array[i]]++;
        }
        max = 0;
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] > max) {
                max = hashArray[i];
                maxI = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != maxI) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        int result = equalizeArray(array);
        System.out.println(result);
    }
}
