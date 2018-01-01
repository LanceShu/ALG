package ALG;

public class 堆排序 {

    public static int[] arrays = {50,10,90,30,70,40,80,60,20};

    public static void main(String[] args) {
//        HeapSort();
        printArray(arrays);
        for(int a : arrays){
            System.out.print(a + " ");
        }
    }


    public static void heapSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        buildMaxHeap(array);

        for (int i = array.length - 1; i >= 1; i--) {
            ArrayUtils.exchangeElements(array, 0, i);

            maxHeap(array, i, 0);
        }
    }

    private static void buildMaxHeap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int half = array.length / 2;
        for (int i = half; i >= 0; i--) {
            maxHeap(array, array.length, i);
        }
    }

    private static void maxHeap(int[] array, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int largest = index;
        if (left < heapSize && array[left] > array[index]) {
            largest = left;
        }

        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        if (index != largest) {
            ArrayUtils.exchangeElements(array, index, largest);

            maxHeap(array, heapSize, largest);
        }
    }

    public static void HeapSort(){
        int i;
        for(i = arrays.length/2;i>0;i--){
            HeapAdjust(i,arrays.length-1);
        }

        for(i = arrays.length-1;i>1;i--){
            swap(1,i);
            HeapAdjust(1,i-1);
        }
    }

    private static void HeapAdjust(int s, int m) {
        int temp;
        int j;

        temp = arrays[s];

        for(j = 2*s;j<=m;j*=2){

            if(j<m && arrays[j] < arrays[j+1]){
                ++j;
            }

            if(temp >= arrays[j]){
                break;
            }

            arrays[s] = arrays[j];
            s = j;
        }
        arrays[s] = temp;
    }

    private static void swap(int i, int i1) {
        int c = arrays[i];
        arrays[i] = arrays[i1];
        arrays[i1] = c;
    }
}
