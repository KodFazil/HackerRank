package StrongPassword;

import java.util.Scanner;

public class Main {               // 25 Ekim 2021 < Fazıl >

    static int minimumCharacter(int n, String s) {
        int lower = 1, upper = 1, special = 1, number = 1, min = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLowerCase(ch)) lower = 0;
            else if (Character.isUpperCase(ch)) upper = 0;
            else if (Character.isDigit(ch)) number = 0;
            else if (s.matches("(?=.*[!@#$%^&*()--+]).+$")) special = 0;
        }
        min = lower + upper + special + number;
        //System.out.println(lower + " " + upper + " " + special + " " + number);
        if (s.length() + min < 6) return 6 - s.length();
        else return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        System.out.println(minimumCharacter(n, s));
    }

}
