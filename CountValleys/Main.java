package CountValleys;

import java.util.Scanner;

public class Main {                // 15 Eylül 2020 < Fazıl >

    static int countValleys(String valleys) {
        int count = 0;
        char[] string = valleys.toCharArray();
        int[] control = new int[string.length + 1];
        control[0] = 0;
        for (int i = 1; i < string.length + 1; i++) {
            if (string[i - 1] == 'U') {
                control[i] = control[i -1] + 1;
            }
            else if (string[i - 1] == 'D') {
                control[i] = control[i - 1] - 1;
                if (control[i] == -1) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valleys = scanner.next();
        System.out.println(countValleys(valleys));
    }
}
