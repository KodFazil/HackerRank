package BirthdayCakeCandles;

import java.util.Scanner;

public class Main {               // 11 Eylül 2020 < Fazıl >

    static int birthdayCakeCandles(int[] array) {
        int total = 0, max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int result = birthdayCakeCandles(array);
        System.out.println(result);
        scanner.close();
    }
}
