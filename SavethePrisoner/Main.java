package SavethePrisoner;

import java.util.Scanner;

public class Main {             // 28 Ekim 2020 < Fazıl >

    static int saveThePrisoner(int n, int m, int s) {
        return ( ( (m-1) + (s-1) ) % n ) + 1;
    }
    /* this works but for larger inputs it gives a timeout error
    so i got another solution for this problem just above this function
    which work faster with removing for loop inside a function
    static int saveThePrisoner(int n, int m, int s) {
        int index = s;
        for (int i = 1; i < m; i++) {
            index++;
            if (index == n + 1){
                index = 1;
            }
        }
        return index;
    }

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] resultArray = new int[t];
        int n, m, s;
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            s = scanner.nextInt();
            resultArray[i] = saveThePrisoner(n, m ,s);
        }
        for (int values: resultArray) {
            System.out.println(values);
        }
    }
}
