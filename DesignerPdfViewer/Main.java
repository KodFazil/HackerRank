package DesignerPdfViewer;

import java.util.Scanner;

public class Main {                    // 18 Ekim 2020 < Fazıl >

    static int designerPdfViewer(int[] h, String word) {
        char[] array = word.toCharArray();
        int max = h[((int) array[0]) - 97];
        for (int i = 1; i < array.length; i++) {
            if (h[((int) array[i]) - 97] > max) {
                max = h[((int) array[i]) - 97];
            }
        }
        return max * word.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            h[i] = scanner.nextInt();
        }
        String word = scanner.next();
        System.out.println(designerPdfViewer(h, word));
    }
}
