package JumpingOnTheCloudsRevisited;

import java.util.Scanner;

public class Main {                   // 11 Kasım 2020 < Fazıl >

    /* it could be written better with while loop and intially
       assign i and first energy loss */
    static int jumpingOnClouds(int[] array, int jump) {
        int energy = 100;
        for (int i = 0; i < array.length; i=((i+jump)%array.length) ) {
            if (i == 0 && energy != 100) {
                if (array[i] == 0) {
                    energy--;
                } else {
                    energy -= 3;
                }
                break;
            }
            else {    // energy -= array[i] * 2 + 1;
                if (array[i] == 0) {
                    energy--;
                    //System.out.println(energy);
                } else {
                    energy -= 3;
                    //System.out.println(energy);
                }
            }
        }
        if (array[0] == 0) {
            energy++;
        } else {
            energy += 3;
        }
        return energy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(jumpingOnClouds(array, k));
    }
}
