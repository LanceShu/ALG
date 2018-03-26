package ALG;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 度度熊想去商场买一顶帽子，商场里有N顶帽子，有些帽子的价格可能相同。度度熊想买一顶价格第三便宜的帽子，问第三便宜的帽子价格是多少？
 输入描述:
 首先输入一个正整数N（N <= 50），接下来输入N个数表示每顶帽子的价格（价格均是正整数，且小于等于1000）


 输出描述:
 如果存在第三便宜的帽子，请输出这个价格是多少，否则输出-1

 输入例子1:
 10
 10 10 10 10 20 20 30 30 40 40

 输出例子1:
 30
 * */

public class 买帽子 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < size; i++) {
            arrays[i] = input.nextInt();
        }
        calculate(arrays);
    }

    private static void calculate(int[] arrays) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arrays) {
            map.put(i, 0);
        }
        if (map.size() < 3) {
            System.out.println("-1");
            return;
        }
        int[] array = new int[map.size()];
        int j = 0;
        for (Integer integer : map.keySet()) {
            array[j++] = integer;
        }
        quickSort(array, 0, array.length - 1);
        System.out.println(array[2]);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end ){
            return;
        }
        int pivot;
        while(start < end) {
            pivot = sort(array, start, end);
            quickSort(array, start, pivot - 1);
            start = pivot + 1;
        }
    }

    private static int sort(int[] array, int start, int end) {
        int key = array[start];
        while(start < end) {
            while(start < end && array[end] >= key) {
                end --;
            }
            array[start] = array[end];
            while(start < end && array[start] <= key) {
                start ++;
            }
            array[end] = array[start];
        }
        array[start] = key;
        return start;
    }
}
