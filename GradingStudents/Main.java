package GradingStudents;

import java.util.Scanner;

public class Main {             // 11 Eylül 2020 < Fazıl >

    static int[] gradingStudents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 38 && array[i] % 5 > 2) {
                array[i] = array[i] += (5 - array[i] % 5);
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] resultArray = gradingStudents(array);
        for (int values: resultArray) {
            System.out.println(values);
        }
    }
}
