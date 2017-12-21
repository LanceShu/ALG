package ALG;

public class 快速排序 {

    public static void main(String[] args) {

        int[] arrys = {3,2,1,6,5,4,9,8,7,6,5,4,3,6,8,5,2,1,4,7,8,9,6,3,2,1,4,5,8,7,4,5,2,14,5,63,2,5,4,1};
        quickSort(arrys,0,arrys.length-1);
        for(Integer i : arrys){
            System.out.print(i + " ");
        }

    }

    public static void quickSort(int[] arrys,int start,int end){

        int pivot;

        while (start<end){
            pivot = sort(arrys,start,end);
            quickSort(arrys,start,pivot-1);
//            quickSort(arrys,pivot+1,end);
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
