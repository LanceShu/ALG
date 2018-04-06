package ALG;

import java.util.HashMap;
import java.util.Scanner;

public class 画家小Q {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] arrays = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrays[i][j] = input.next().charAt(0);
            }
        }
        calculate(arrays, n, m);

    }

    private static void calculate(char[][] arrays, int n, int m) {
        if (arrays.length == 0 || arrays == null) {
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map.put(arrays[i][j], 0);
            }
        }
        System.out.println(map.size() - 1);
    }
}
