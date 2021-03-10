package JumpingOnTheClouds;

import java.util.Scanner;

public class Main {            // 10 Mart 2021 < Fazıl >

    static int jumpingOnClouds(int[] array) {
        int jump = 0;
        int i = 0;
        while (i != array.length-1) {
            if (i != array.length-2 && array[i+2] == 0) {
                i += 2;
                jump++;
            }
            else {
                i++;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scanner.nextInt();
        }
        int result = jumpingOnClouds(array);
        System.out.println(result);
    }
}
