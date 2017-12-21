package ALG;

public class 归并排序 {

    private static int length ;
    private static int sm;

    public static void main(String[] args) {

        int[] arrats = new int[]{50,10,90,30,70,40,80};
        System.out.println(arrats);



    }

    public static void sort(int[] data,int left,int right){
        if(left >= right){
            return ;
        }

        int center = (left + right)/2;
        sort(data,left,center);
        sort(data,center+1,right);
        merge(data,left,center,right);

    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center +1;
        int third = left;

        while(left <= center && mid <= right){
            if(data[left] <= data[mid]){
                tmpArr[third++] = data[left++];
            }else {
                tmpArr[third++] = data[mid++];
            }
        }

        while(mid <= right){

        }
    }

    public static void mergeSort(int[] arrays){
        int[] tr = new int[arrays.length];
        int k = 0;
        while(k < arrays.length-1){
            mergePass(arrays,tr,k,arrays.length-1);
            k = 2*(k+1);
            mergePass(tr,arrays,k,arrays.length-1);
            k = 2*(k+1);
        }
    }

    private static void mergePass(int[] tr, int[] arrays, int s, int n) {
        int i = 1;
        int j;

        while(i < n-2*s+1){
            Merge(tr,arrays,i,i+s-1,i+2*s-1);
            i = i+2*s;
        }

        if(i < n-s+1){
            Merge(tr,arrays,i,i+s-1,n);
        }else{
            for(j = i;j<=n;j++){
                arrays[j] = tr[j];
            }
        }
    }


}
