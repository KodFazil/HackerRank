package DrawingBook;

import java.util.Scanner;

public class Main {            // 15 Eylül 2020 < Fazıl >

    static int drawingBook(int tPage, int page) {
        int result = 0, fromEnd = 0, fromBegin = 0;
        fromEnd = (tPage - page) / 2;
        if (page % 2 == 0) {
            fromBegin = (page - 1) / 2 + 1;
        }
        else {
            fromBegin = (page - 1) / 2;
        }
        if (fromBegin < fromEnd) {
            result = fromBegin;
        }
        else {
            result = fromEnd;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(drawingBook(n, p));
    }
}
