package Cats_Mouse;

import java.util.Scanner;

public class Main {                // 15 Eylül 2020 < Fazıl >

    static String catsAndMouse(int x ,int y, int z) {
        int catAToMouse = 0, catBToMouse = 0, result = 0;
        // ternary operator
        catAToMouse = z > x ? z - x : x - z;
        if (z > y) catBToMouse = z - y;
        else catBToMouse = y - z;
        if (catAToMouse == catBToMouse) {
            return "Mouse C";
        }
        else if (catAToMouse < catBToMouse) {
            return "Cat A";
        }
        else {
            return "Cat B";
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int x, y, z;
        String[] array = new String[q];
        for (int i = 0; i < q; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            array[i] = catsAndMouse(x, y, z);
        }
        for (String values: array) {
            System.out.println(values);
        }
    }
}
