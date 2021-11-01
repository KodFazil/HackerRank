package QuickSort1Partition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {     // 1 Kasım 2021 < Fazıl >

    static int[] quickSort(int[] array) {
        int pivot = array[0];
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot)
                left.add(array[i]);
            else if (array[i] == pivot)
                equal.add(array[i]);
            else
                right.add(array[i]);
        }
        int [] result = new int[array.length];
        int count = 0;
        for (int j = 0; j < left.size(); j++)
            result[count++] = left.get(j);
        for (int k = 0; k < equal.size(); k++)
            result[count++] = equal.get(k);
        for (int l = 0; l < right.size(); l++)
            result[count++] = right.get(l);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        int[] result = quickSort(array);
        for (int values : result) {
            System.out.print(values + " ");
        }
    }

}
