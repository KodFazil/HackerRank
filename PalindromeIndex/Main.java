package PalindromeIndex;

import java.util.Scanner;

public class Main {         // 10 Kasım 2021 < Fazıl >
    // Not: Tüm caseleri geçemedi zaman kısıtından, O(n) lik çözüm varmış. Bir ara tekrar bakıcam.
    static boolean isPalindrome(String s) {
        int i = 0;
        while (i < s.length() / 2 && s.charAt(i) == s.charAt(s.length() - i - 1)) i++;
        return i == s.length() / 2;
    }

    static int palindromeIndex(String s) {
        StringBuilder sb;
        if (isPalindrome(s)) return -1;
        else if (!isPalindrome(s)) { // if it can be palindrome
            for (int i = 0; i < s.length(); i++) {
                sb = new StringBuilder(s);
                sb.deleteCharAt(i);
                if (isPalindrome(sb.toString())) return i;
            }
        }
        return -1;  // if it can not be palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String s;
        for (int i = 0; i < q; i++) {
            s = scanner.next();
            System.out.println(palindromeIndex(s));
        }
    }
}
