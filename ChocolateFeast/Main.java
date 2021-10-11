package ChocolateFeast;

import java.util.Scanner;

public class Main {                // 11 Ekim 2021 < Fazıl >
    
    static int chocolateFeast(int money, int cost, int wrapperCost) {
        int chocolate = money / cost;
        int jeton = chocolate;
        while (jeton >= wrapperCost) {
            chocolate += jeton / wrapperCost;
            jeton = (jeton / wrapperCost) + (jeton % wrapperCost);
        }
        return chocolate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] result = new int[t];
        int money, cost, wrapper;
        for (int i = 0; i < t; i++) {
            money = scanner.nextInt();
            cost = scanner.nextInt();
            wrapper = scanner.nextInt();
            result[i] = chocolateFeast(money, cost, wrapper);
        }
        for (int values : result) {
            System.out.println(values);
        }
    }
}
