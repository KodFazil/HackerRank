package CamelCase;

import java.util.Scanner;

public class Main {             // 9 Ağustos 2021 < Fazıl >

    static int camelCase(String s) {
        int count = 1;
        char [] sarr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (sarr[i] >= 65 && sarr[i] <= 90)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(camelCase(s));

    }

}
