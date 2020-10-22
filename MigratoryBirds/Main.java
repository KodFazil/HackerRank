package MigratoryBirds;

import java.util.Scanner;

public class Main {           // 13 Eylül 2020 < Fazıl >

    static int migratoryBirds(int[] array) {
        int[] itemArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    itemArray[i]++;
                }
            }
        }
        int max = itemArray[0], number = array[0];
        for (int i = 0; i < itemArray.length; i++) {
            if (itemArray[i] > max) {
                max = itemArray[i];
                number = array[i];
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sights = new int[n];
        for (int i = 0; i < n; i++) {
            sights[i] = scanner.nextInt();
        }
        System.out.println(migratoryBirds(sights));
    }
}
