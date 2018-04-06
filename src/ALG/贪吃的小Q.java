package ALG;

import java.util.Scanner;

public class 贪吃的小Q {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int count =input.nextInt();
        int pre = count / 2;
        int start = 0;
        int end = count;
        int first = 0;
        int i = end - start;
        while (i > 1) {
            int x = calculate(pre, day);
            if (x <= count) {
                first = pre;
                start = pre;
                pre = (pre + end) / 2;
            } else {
                end = pre;
                pre = (pre + start) / 2;
            }
            i = end - start;
        }
        System.out.print(first);
    }

    static int calculate(int pre, int day) {
        int r=0;
        for (int i=0;i < day;i++) {
            r += pre;
            if (pre % 2 == 0) {
                pre = pre / 2;
            }else {
                pre = pre / 2 + 1;
            }
        }
        return r;
    }
}
