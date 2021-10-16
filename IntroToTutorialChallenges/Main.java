package IntroToTutorialChallenges;

import java.util.Scanner;

public class Main {             // 16 Ekim 2021 < Fazıl >

    static int introTutorial(int [] arr, int v) {
        int first = 0, last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] > v) {
                last = mid - 1;
            }
            else if (arr[mid] < v) {
                first = mid + 1;
            }
            else { // arr[mid] == v
                return mid;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(introTutorial(array, v));
    }
}
