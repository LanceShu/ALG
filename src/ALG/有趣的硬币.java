package ALG;

import java.util.Scanner;

public class 有趣的硬币 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        calculate(s);
    }

    private static void calculate(String s) {
        if (s == null || s.length() < 1 || s.length() > 50)
            return;
        if (s.length() == 1)
            System.out.println(1);
        int n = 1;
        int m = 0;
        s = s.toUpperCase();
        char[] array = s.toCharArray();
        char c = array[0];
        for (int i = 1; i < s.length(); i++) {
            if (array[i] == c) {
                if (n != 1) {
                    m += n;
                }
                n = 1;
            } else {
                n ++;
            }
            c = array[i];
        }
        System.out.println(m);
    }
}
