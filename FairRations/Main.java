package FairRations;

import java.util.Scanner;

public class Main {           // 7 Mayıs 2021 < Fazıl >

    static String fairRations(int [] array) {

        String s = "";
        int sum = 0;
        int loaves = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 1) {
            s = "NO";
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 1) {
                    array[i]++;
                    array[i+1]++;
                    loaves += 2;
                }
            }
            s = String.valueOf(loaves);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(fairRations(array));
    }
}
