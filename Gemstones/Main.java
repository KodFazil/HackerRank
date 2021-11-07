package Gemstones;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {         // 7 Kasım 2021 < Fazıl >

    static int gemstones(String[] array) {
        int control = 0;
        int none = 0;
        int[] hashArray = new int[26];
        for (int i = 0; i < array[0].length(); i++) {
            hashArray[array[0].charAt(i) - 97] = 1;
        } // make it set
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int j = 0; j < hashArray.length; j++) {
            if (hashArray[j] == 1) {
                arrayList.add((char) (j + 97));
            }
        }
        for (int k = 0; k < arrayList.size(); k++) {
            control = 0;
            for (int l = 1; l < array.length && control >= 0; l++) {
                if ( ! array[l].contains(String.valueOf(arrayList.get(k)))) {
                    control = -1;
                    none--;
                }
            }
        }
        return arrayList.size() + none;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) array[i] = scanner.next();
        System.out.println(gemstones(array));
    }
}
