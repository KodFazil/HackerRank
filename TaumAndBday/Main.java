package TaumAndBday;

import java.util.Scanner;

public class Main {

    static long taumBday(int b, int w, int bc, int wc, int z) {
        int small = 0;
        long total = 0;
        if (bc == wc) {
            total = (((long) b * bc) + ((long) w * wc));
            return total;
        }
        if (bc < wc) {
            small = bc;
            if (small + z < wc)
                total = (long) small * (b + w) + (long) w * z;
            else
                total = (((long) b * bc) + ((long) w * wc));
        }
        else {
            small = wc;
            if (small + z < bc)
                total = (long) small * (b + w) + (long) b * z;
            else
                total = (((long) b * bc) + ((long) w * wc));
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] resultArr = new long[t];
        int b, w, bc, wc, z; // gifts, prices
        for (int i = 0; i < t; i++) {
            b = scanner.nextInt();
            w = scanner.nextInt();
            bc = scanner.nextInt();
            wc = scanner.nextInt();
            z = scanner.nextInt();
            resultArr[i] = taumBday(b, w, bc, wc, z);
        }
        for (int i = 0; i < t; i++)
            System.out.println(resultArr[i] +" ");
    }
}
