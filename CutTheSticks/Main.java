package CutTheSticks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {             // 17 Kasım 2020 < Fazıl >

    static int[] cutTheSticks(int[] array) {
        Arrays.sort(array);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(array.length);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i+1]) {
                arrayList.add(array.length - i - 1);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = cutTheSticks(array);
        for (int values : result) {
            System.out.println(values);
        }
    }
}
