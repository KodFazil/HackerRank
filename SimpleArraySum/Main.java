package SimpleArraySum;

import java.util.Scanner;

public class Main {             //  9 Eylül 2020 < Fazıl >

    static int simpleArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //taking length of an array
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (int i = 0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int result = simpleArraySum(array);
        System.out.println(result);
    }
}
