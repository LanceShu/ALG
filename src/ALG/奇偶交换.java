package ALG;

public class 奇偶交换 {

    public static void main(String[] args) {

        int[] arrays = {2,4,6,1,2,3};
        int pivot = exchangeArrays(arrays);
        System.out.println(pivot);

        快速排序.quickSort(arrays,0,pivot-1);
        快速排序.quickSort(arrays,pivot,arrays.length-1);


        for(Integer integer : arrays){
            System.out.print(integer+" ");
        }

    }

    public static int exchangeArrays(int[] arrays){

        int start = 0;
        int end = arrays.length-1;

        while(start < end){

            while(start < end && arrays[start]%2!=0){
                start++;
            }

            while(start<end && arrays[end]%2==0){
                end--;
            }

            int change = arrays[start];
            arrays[start] = arrays[end];
            arrays[end] = change;

        }

        return start;
    }


}
