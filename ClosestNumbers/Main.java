package ClosestNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {       // 8 Kasım 2021 < Fazıl >

    static int[] closestNumbers(int [] array) {
        Arrays.sort(array);
        int min = 10000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i+1] - array[i]) < min)
                min = Math.abs(array[i+1] - array[i]);
        }
        for (int j = 0; j < array.length - 1; j++) {
            if (Math.abs(array[j+1] - array[j]) == min) {
                arrayList.add(array[j]);
                arrayList.add(array[j+1]);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int k = 0; k < arrayList.size(); k++) {
            result[k] = arrayList.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        int [] result = closestNumbers(array);
        for (int values : result) System.out.print(values + " ");
    }

}
