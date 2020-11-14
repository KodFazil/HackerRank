package SockMerchant;

import java.util.Scanner;

public class Main {         // 13 Eylül 2020 < Fazıl >
    
    static int sockMerchant(int n, int[] array) {
        int count = 0, pairs = 0, control = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            control = 0;
            pairs = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] != array[j]) {
                    control++;
                }
            }
            if (control == i) {
                for (int j = i; j < n; j++) {
                    if (array[i] == array[j]) {
                        pairs++;
                    }
                }
            }
            sum += pairs / 2;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] socks = new int[n];
        for (int i = 0; i < n; i++) {
            socks[i] = scanner.nextInt();
        }
        System.out.println(sockMerchant(n, socks));
    }
}
