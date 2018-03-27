package ALG;

import java.util.Scanner;

public class 妞妞零食 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long w = input.nextInt();
        long[] array = new long [n];
        for (int i = 0; i < n; i ++){
            array[i] = input.nextLong();
        }
        System.out.print(c(array, 0, new long[n], 0, w));
    }

    private static int c(long[] array, int index, long[] ll, long sum, long max) {
        int s = 0;
        if (index == array.length)
            return s;
        s ++;
        for (int i = index; i < ll.length; i ++) {
            if (array[i] != -1) {
                ll[i] = array[i];
                if (sum + ll[i] <= max){
                    if (i == ll.length -1) {
                        s++;
                    }
                    s += c(array, i+1, ll, sum + ll[i], max);
                }
            }
        }
        ll[index] = 0;
        return s;
    }
}
