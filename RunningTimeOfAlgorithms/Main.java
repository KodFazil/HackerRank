package RunningTimeOfAlgorithms;

import java.util.Scanner;

public class Main {      // 31 Ekim 2021 < Fazıl >

    static int runningTime(int [] array) {
        int shiftCount = 0, key, j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j+1] = array[j];
                shiftCount++;
                j--;
            }
            array[j + 1] = key;
        }
        return shiftCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        System.out.println(runningTime(array));
    }

}
