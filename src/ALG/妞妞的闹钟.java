package ALG;

import java.util.Scanner;

public class 妞妞的闹钟 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        if (count < 0 || count > 100) {
            return;
        }
        int[][] array = new int[count][2];
        for (int i = 0; i < count; i++) {
            array[i][0] = input.nextInt();
            if (array[i][0] < 0 || array[i][0] >= 24)
                return;
            array[i][1] = input.nextInt();
            if (array[i][1] < 0 || array[i][1] >= 60)
                return;
        }
        int time = input.nextInt();
        if (time < 0 || time > 100)
            return;
        int[] result = new int[2];
        for (int i = 0; i < 2; i++) {
            result[i] = input.nextInt();
        }
        if ((result[0] < 0 || result[0] >= 24) || (result[1] < 0 || result[1] >= 60))
            return;
        calculate(array, time, result);
    }

    private static void calculate(int[][] array, int time, int[] result) {
        int[][] cal = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            int min = calcul(array[i][1], time);
            if (min >= 60) {
                cal[i][0] = array[i][0] + 1;
                cal[i][1] = min - 60;
            } else {
                cal[i][0] = array[i][0];
                cal[i][1] = min;
            }
        }
        int i = compare(cal, result);
        if (i != -1) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }

    private static int compare(int[][] cal, int[] result) {
        for(int i = cal.length - 1; i >= 0; i --) {
            if((cal[i][0] < result[0]) || (cal[i][0] == result[0] && cal[i][1] <= result[1])) {
                return i;
            }
        }
        return -1;
    }

    private static int calcul(int min, int time) {
        return min + time;
    }
}
