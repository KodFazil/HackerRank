package LisasWorkbook;

import java.util.Scanner;

public class Main {           // 11 Mayıs 2021 < Fazıl >

    static int workbook(int n, int k, int [] arr) {
        int special = 0;
        int pageNumber = 1;
        int m = 1;
        for (int i = 0; i < n; i++) {   // for chapters
            m = 1;
            for (int j = 1; j <= arr[i]; j++) {  // for questions
                if (j > k * m) {
                    pageNumber++;
                    m++;
                }
                if (j == pageNumber) {
                    special++;
                }
            }
            pageNumber++;
        }
        return special;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(workbook(n, k, arr));
    }
}
