package ModifiedKaprekarNumbers;

import java.util.Scanner;

public class Main {               // 9 Ekim 2021 < Fazıl >

    static void kaprekarNumbers(int p, int q) {
        String square, first, last;
        int digit, sqDigit, count = 0, firstPart, lastPart;
        for (int i = p; i <= q; i++) {
            digit = String.valueOf(i).length();
            square = String.valueOf(((long) i * i));
            sqDigit = square.length();
            first = square.substring(0, (sqDigit - digit));
            last = square.substring((sqDigit - digit));
            try {
                firstPart = Integer.parseInt(first);
                lastPart = Integer.parseInt(last);
            }
            catch (NumberFormatException e)
            {
                firstPart = 0;
                lastPart = 0;
            }
            if (firstPart + lastPart == i || i == 1) {
                System.out.print(i + " ");
                count = 1;
            }
        }
        if (count == 0)
            System.out.println("INVALID RANGE");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        kaprekarNumbers(p, q);
    }
}
