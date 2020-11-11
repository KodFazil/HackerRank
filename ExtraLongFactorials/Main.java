package ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {            // 11 Kasım 2020 < Fazıl >

    static BigInteger factorial(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <=n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
