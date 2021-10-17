package FlatlandSpaceStations;

import java.util.Arrays;
import java.util.Scanner;

public class Main {             // 17 Ekim 2021 < Fazıl >

    static int flatlandSpaceStations(int n, int[] c) {
        int max, distance, lastStationDistance;
        Arrays.sort(c);   // başta sonda ve aradaki station durumları için sıralama
        max = c[0]; // -,-,-,station,-,-,... ilk station durumu için
        for (int i = 1; i < c.length; i++) { // ...-,-,station,-,-,-,station,-,-... aradaki station durumları için
            distance = (c[i] - c[i-1]) / 2;
            if (distance > max)
                max = distance;
        }
        lastStationDistance = n - 1 - c[c.length - 1];  // ...-,-,station,-,-,- son station durumu için
        max = Math.max(max, lastStationDistance);
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = scanner.nextInt();
        }
        System.out.println(flatlandSpaceStations(n, c));
    }
}

// tüm caseleri geçemedi timedan dolayı
/*
    int max = 0, min, minI;
        for (int i = 0; i < n; i++) {
            minI = 10000;
            for (int j = 0; j < c.length; j++) {
                min = Math.abs(i - c[j]);
                if (min < minI)
                    minI = min;
            }
            if (minI > max)
                max = minI;
        }
    return max;
 */