package MarsExploration;

import java.util.Scanner;

public class Main {         // 31 Ekim 2021 < Fazıl >

    static int marsExploration(String s) {
        int count = 0;
        String sos = "SOS", correct = "";
        for (int i = 0; i < s.length() / 3; i++)
            correct += sos;
        for (int j = 0; j < s.length(); j++)
            if (s.charAt(j) != correct.charAt(j))
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(marsExploration(s));
    }

}
