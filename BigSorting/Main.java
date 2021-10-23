package BigSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {            // 23 Ekim 2021 < Fazıl >

    // -> : JAVA 8
    static String [] bigSorting(String [] arr) {
        Arrays.sort(arr, (left, right) -> {
            if (left.length() != right.length())
                return left.length() - right.length();
            return left.compareTo(right);
        });
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }
        String [] arr = bigSorting(array);
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}
