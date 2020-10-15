package DayOfTheProgrammer;

import java.util.Scanner;

public class Main {              // 13 Eylül 2020 < Fazıl >

    static String dayOfProgrammer(int year) {
        if (year % 4 == 0) {
            return "12.09." + year;
        }
        else {
            return "13.09." + year;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(dayOfProgrammer(year));
    }
}
