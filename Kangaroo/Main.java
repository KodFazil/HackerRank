package Kangaroo;

import java.util.Scanner;

public class Main {             // 11 Eylül 2020 < Fazıl: Çok şükür >

    static void kangaroo(int x1, int v1, int x2, int v2) {
        while(x2 > x1) {
            x1 += v1;
            x2 += v2;
        }
        if (x1 == x2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        kangaroo(x1, v1, x2, v2);
        scanner.close();
    }
}
