package ALG;

import java.util.Scanner;

public class 整除 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        calculate(n);
    }

    private static void calculate(int n) {
        if (n < 1 || n > 100000) {
            return;
        }
        for (int i = n;;i ++) {
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    if (j == n) {
                        System.out.println(i % 987654321);
                        return;
                    }
                }else {
                    break;
                }
            }
        }
    }
}
