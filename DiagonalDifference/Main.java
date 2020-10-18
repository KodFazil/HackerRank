package DiagonalDifference;

import java.util.Scanner;

public class Main {                  // 10 Eylül 2020 < Fazıl >

    static int diagonalDifference(int[][] matrix) {
        int leftToRight = 0, rightToLeft = 0, absDifference = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    leftToRight += matrix[i][j];
                }
                if (i + j == matrix.length - 1) {
                    rightToLeft += matrix[i][j];
                }
            }
        }
        if (leftToRight > rightToLeft) {
            absDifference = leftToRight - rightToLeft;
        }
        else {
            absDifference = rightToLeft - leftToRight;
        }
        return absDifference;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int result = diagonalDifference(matrix);
        System.out.println(result);
    }
}
