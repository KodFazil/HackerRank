package WeightedUniformStrings;

import java.util.Scanner;

public class Main {            // 2 Kasım 2021 < Fazıl >

    static String[] weightedUniformStrings(String s, int[] queries) {
        String[] result = new String[queries.length];
        int [] array = new int[s.length()];
        array[0] = s.charAt(0) - 96;
        int weight = array[0];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                weight += s.charAt(i) - 96;
                array[i] = weight;
            }
            else {
                weight = s.charAt(i) - 96;
                array[i] = weight;
            }
        }
        int k = 0;
        for (int j = 0; j < queries.length; j++) {
            k = 0;
            while (k < array.length && queries[j] != array[k]) k++;
            if (k == array.length) result[j] = "No";
            else result[j] = "Yes";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int[] queries = new int[n];
        for (int i = 0; i < n; i ++) {
            queries[i] = scanner.nextInt();
        }
        String [] result = weightedUniformStrings(s, queries);
        for (String values : result) System.out.println(values);
    }
}
