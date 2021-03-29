package Encryption;

import java.util.Scanner;

public class Main {               // 29 Mart 2021 < Fazıl >
    
    static String encryption(String str) {
        String encrypted = "";
        String noSpaceStr = str.replaceAll("\\s+", "");
        int row = (int) Math.sqrt(noSpaceStr.length());
        int column = row + 1;
        if (row * column < noSpaceStr.length())
            row++;
        char[] strArr = noSpaceStr.toCharArray();
        int k = 0;
        char[][] matrix = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column && k < strArr.length; j++) {
                matrix[i][j] = strArr[k++];
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (!String.valueOf(matrix[j][i]).equals(" "))
                    encrypted = encrypted.concat(String.valueOf(matrix[j][i]));
                if (j == row - 1)
                    encrypted = encrypted.concat(" ");
            }
        }
        return encrypted.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(encryption(str));
    }
}
