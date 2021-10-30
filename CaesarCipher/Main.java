package CaesarCipher;

import java.util.Scanner;

public class Main {            // 30 Ekim 2021 < Fazıl >

    static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isLetter(sb.charAt(i))) {
                //System.out.println( (int) sb.charAt(i) +" " + (((int) sb.charAt(i) + k) % 26));
                if (Character.isUpperCase(sb.charAt(i)))
                    sb.setCharAt(i, (char) (((int) sb.charAt(i) + k - 65) % 26 + 65));
                else if (Character.isLowerCase(sb.charAt(i)))
                    sb.setCharAt(i, (char) (((int) sb.charAt(i) + k - 97) % 26 + 97));
                //sb.setCharAt(i, (char) (((int) sb.charAt(i) + k) % 26));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int k = scanner.nextInt();
        System.out.println(caesarCipher(s, k));
    }

}
