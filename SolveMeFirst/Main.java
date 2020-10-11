package SolveMeFirst;

import java.util.Scanner;

public class Main {                  //  9 Eylül 2020 < Fazıl >

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
