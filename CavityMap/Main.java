package CavityMap;

import java.util.Scanner;

public class Main {               // 15 Ekim 2021 < Fazıl >

    static String[] cavityMap(String [] array) {
        int[][] matris = new int[array.length][];
        StringBuilder sb;
        for (int i = 0; i < array.length; i++) {
            matris[i] = new int[array.length];
            for (int j = 0; j < array.length; j++) {
                matris[i][j] = array[i].charAt(j);
            }
        }
        for (int k = 1; k < array.length - 1; k++) {
            sb = new StringBuilder(array[k]);
            //System.out.println(sb);
            for (int l = 1; l < array.length - 1; l++) {
                //System.out.println(matris[k][l]);
                if (matris[k][l] > matris[k-1][l] && matris[k][l] > matris[k+1][l] &&
                        matris[k][l] > matris[k][l-1] && matris[k][l] > matris[k][l+1]) {
                    sb.setCharAt(l, 'X');
                    array[k] = sb.toString();
                    //System.out.println(array[k].charAt(l));
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        arr = cavityMap(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
