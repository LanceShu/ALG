package ALG;

public class 堆排序 {

    public static int[] arrays = {50,10,90,30,70,40,80,60,20};

    public static void main(String[] args) {
        HeapSort();
        for(int a : arrays){
            System.out.print(a + " ");
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
