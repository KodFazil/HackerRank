package CountingSort1;

import java.util.Scanner;

public class Main {       // 6 Kasım 2021 < Fazıl >

    static int[] countingSort(int[] array) {
        int [] frequencyArray = new int[100];
        for (int i = 0; i < array.length; i++) frequencyArray[array[i]]++;
        return frequencyArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        int [] result = countingSort(array);
        for (int values : result) System.out.print(values + " ");
    }

}
