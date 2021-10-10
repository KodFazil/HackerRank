package HallowenSale;

import java.util.Scanner;

public class Main {                // 10 Ekim 2021 < Fazıl >

    static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int currentPrice = p;
        while (s >= currentPrice) {
            s -= currentPrice;
            count++;
            //if (currentPrice - d > m) currentPrice -= d; else currentPrice = m;
            currentPrice = Math.max(currentPrice - d, m);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(howManyGames(p, d, m, s));
    }
}
