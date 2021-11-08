package BeatifulBinaryString;

import java.util.Scanner;

public class Main {     // 8 Kasım 2021 < Fazıl >

    static int beautifulBinaryString(String s) {
        int count = 0, k = 0;
        for (int i = 0; i < s.length() - 2; i=k) {
            if (s.substring(i, i+3).equals("010")) {
                count++;
                k = i + 3;
                //System.out.println("count : " + count + " i : " + i);
            }
            else k++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(beautifulBinaryString(s));
    }
}
