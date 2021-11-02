package Pangrams;

import java.util.Scanner;

public class Main {            // 2 Kasım 2021 < Fazıl >

    static String pangrams(String s) {
        int[] array = new int[26];
        int control = 0; // if 26 means array full and no more control needs
        for (int values: array) values = 0;
        for (int i = 0; i < s.length() && control <= 26; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (array[s.charAt(i)-65] == 0) control++;
                array[s.charAt(i)-65] += 1;
            }
            else if (Character.isLowerCase(s.charAt(i))){
                if (array[s.charAt(i)-97] == 0) control++;
                array[s.charAt(i)-97] += 1;
            }
        }

        return control == 26 ? "pangram": "not pangram";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(pangrams(s));
    }
}
