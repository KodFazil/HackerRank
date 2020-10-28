package BeautifulDaysattheMovies;

import java.util.Scanner;

public class Main {                 // 21 Ekim 2020 < Fazıl >

    static int beatifulDays(int first, int last, int k) {
        int item = 0, reverse = 0, rem = 0, number = 0;
        for (int i = first; i <=last; i++) {
            number = i; reverse = 0;
            while (number != 0) {
                rem = number % 10;
                reverse = reverse * 10 + rem;
                number /= 10;
            }
            number = i;
            //System.out.println(number+" "+reverse);
            if ((number - reverse) % k == 0) {
                item++;
            }
        }
        return item;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(beatifulDays(i, j, k));
    }
}
