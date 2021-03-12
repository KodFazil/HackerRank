package AcmIcpcTeam;

import java.util.Scanner;

public class Main {               // 12 Mart 2021 < Fazıl >

    static int[] acmTeam(String[] topic) {
            int n = topic.length;
            int count = 0, max = 0, maxCount = 1;
            for (int i = 0; i < n - 1; i++) {
                char[] first = topic[i].toCharArray();
                for (int j = i + 1; j < n; j++) {
                    char[] second = topic[j].toCharArray();
                    count = 0;
                    for (int k = 0; k < first.length; k++) {
                        //System.out.println("kkkkk");
                        //count++;
                        if (first[k] == '1' || second[k] == '1') {
                            count++;
                        }
                    }
                    if (count > max) {
                        max = count;
                        maxCount = 1;
                    }
                    else if (count == max) {
                        maxCount++;
                        //System.out.println(i+" "+j+" "+"count"+count+"max"+max+"Maxcount"+   maxCount);
                    }
                 }
            }
            int[] result = new int[2];
            result[0] = max;
            result[1] = maxCount;
            return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // number of attendees
        int m = scanner.nextInt(); // number of topics
        String[] topics = new String[n];
        for (int i = 0; i < n; i++) {
            topics[i] = scanner.next();
        } /*
        for (int i = 0; i < n; i++) {
            System.out.println(topics[i]);
        } */
        int[] resultArr = acmTeam(topics);
        for (int i = 0; i < 2; i++)
            System.out.println(resultArr[i]);
    }
}
