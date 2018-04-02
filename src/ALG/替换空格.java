package ALG;

import java.util.Scanner;

public class 替换空格 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arrays = input.nextLine().toCharArray();
        calculate(arrays);
    }

    private static void calculate(char[] arrays) {
        if (arrays.length <= 0 || arrays == null) {
            return;
        }
        int whiteCount = 0;
        for (char c : arrays) {
            if (c == ' ') {
                whiteCount ++;
            }
        }
        if (whiteCount == 0) {
            print(arrays);
            return;
        }
        int targetCount = arrays.length + 2 * whiteCount;
        int tmp = arrays.length;
        char[] charge = new char[targetCount];
        targetCount --;
        tmp --;
        while(tmp >= 0 && tmp <= targetCount) {
            if (arrays[tmp] == ' ') {
                charge[targetCount --] = '0';
                charge[targetCount --] = '2';
                charge[targetCount --] = '%';
            } else {
                charge[targetCount --] = arrays[tmp];
            }
            tmp --;
        }
        print(charge);
    }

    private static void print(char[] array) {
        for(char c : array) {
            System.out.print(c);
        }
    }
}
