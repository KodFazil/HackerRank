package BonAppetit;

import java.util.Scanner;

public class Main {            // 13 Eylül 2020 < Fazıl >

    static void bonAppetit(int[] bills, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            if (i != k) {
                sum += bills[i];
            }
        }
        sum /= 2;
        if (b == sum) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b - sum);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] bills = new int[n];
        for (int i = 0; i < n; i++) {
            bills[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        bonAppetit(bills, k, b);
    }
}
