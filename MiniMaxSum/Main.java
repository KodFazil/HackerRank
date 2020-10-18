package MiniMaxSum;

import java.util.Scanner;

public class Main {                  // 10 Eylül 2020 < Fazıl >

    static void miniMaxSum(long[] array) {
        long maxValue = array[0], minValue = array[0], total = 0, maxT = 0, minT;
        for (int i = 0; i < 5; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
            total += array[i];
        } /* or this extra one
        for (long values: array) {
            if (values > maxValue) {
                maxValue = values;
            }
            if (values < minValue) {
                minValue = values;
            }
            total += values;
        } */
        maxT = total - minValue;
        minT = total - maxValue;
        System.out.println(minT + " " + maxT);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = new long[5];
        for (int i = 0; i < 5; i++) {
             array[i] = scanner.nextLong();
        }
        /* su kısım olmuyor sanırım hemen kullanmak gerekiyor bu values u
        foreach i yani, parametre olarak calısmadı bu sekliyle
        for (long values : array) {
            values = scanner.nextLong();
        } */
        miniMaxSum(array);
    }
}
