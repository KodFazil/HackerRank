package SherlockAndSquares;

import java.util.Scanner;

public class Main {            // 13 Kasım 2020 < Fazıl >

    static int squares(int a, int b) {
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int a, b;
        int[] result = new int[q];
        for (int i = 0; i < q; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result[i] = squares(a, b);
        }
        for (int values : result) {
            System.out.println(values);
        }
    }
}
