package AlternatingCharacters;

import java.util.Scanner;

public class Main {                            // 28 Eylül 2021 < Fazıl >

    static int alternatingCharacters(String s) {
        int count = 0;
        char [] array = s.toCharArray();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        String s = "";
        int [] result = new int[q];
        for (int i = 0; i < q; i++) {
            s = scanner.next();
            result[i] = alternatingCharacters(s);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
