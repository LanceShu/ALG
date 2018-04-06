package ALG;

import java.util.Scanner;

public class 妞妞抽牌 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int niu  = 0;
        int yang = 0;
        int m = input.nextInt();
        int[] n = new int[m];
        for (int i = 0; i < m; i++) {
            n[i] = input.nextInt();
        }
        quickSort(n, 0, n.length - 1);
        int i = m - 1;
        while (i >= 0) {
            niu += n[i--];
            if (i < 0) {
                break;
            }
            yang += n[i--];
        }
        System.out.println(niu - yang);
    }

    private static void quickSort(int[] arrys,int start,int end){
        if (arrys.length == 0 || arrys == null)
            return;
        int pivot;
        while (start<end){
            pivot = sort(arrys,start,end);
            quickSort(arrys,start,pivot-1);
            start = pivot + 1;
        }
    }

    private static int sort(int[] arrys, int start, int end) {
        int key = arrys[start];
        while(start < end){
            while(start < end && arrys[end] >= key){
                end--;
            }
            arrys[start] = arrys[end];
            while(start < end && arrys[start] <= key){
                start++;
            }
            arrys[end] = arrys[start];
        }
        arrys[start] = key;
        return start;
    }
}
