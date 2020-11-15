package LibraryFine;

import java.util.Scanner;

public class Main {               // 15 Kasım 2020 < Fazıl >

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) return 10000;
        else if (m1 > m2 && y1>=y2) return (m1 - m2) * 500;
        else if (d1 > d2 && m1 >= m2 && y1 >= y2) return (d1 - d2) * 15;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
    }
}
