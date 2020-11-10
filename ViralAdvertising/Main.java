package ViralAdvertising;

import java.util.Scanner;

public class Main {             // 28 Ekim 2020 < Fazıl >

    static int viralAdvertising(int n) {
        int liked = 2, cumulative = 2;
        for (int i=1; i < n; i++) {
            liked = liked * 3 / 2;
            cumulative += liked;
        }
        return cumulative;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(viralAdvertising(n));

    }
}
