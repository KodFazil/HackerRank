package AngryProfessor;

import java.util.Scanner;

public class Main {              // 21 Ekim 2020 < Fazıl >

    static String angryProfessor(int k, int[] array) {

        int ontime = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0)
                ontime++;
        }
        if (k>ontime)
            return "YES";
        else
            return "NO";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n, k;
        int[] a;
        String[] result = new String[t];
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            result[i] = angryProfessor(k, a);
        }
        for (int i = 0; i < t; i++)
            System.out.println(result[i]);
    }
}
