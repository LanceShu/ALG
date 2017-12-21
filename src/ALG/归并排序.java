package ALG;

public class 归并排序 {

    private static int length ;
    private static int sm;

    public static void main(String[] args) {

        int[] arrats = new int[]{50,10,90,30,70,40,80};
        sort(arrats,0,arrats.length-1);
        for(Integer integer : arrats){
            System.out.print(integer + " ");
        }

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

        int tmp = left;

        while(left <= center && mid <= right){
            if(data[left] <= data[mid]){
                tmpArr[third++] = data[left++];
            }else {
                tmpArr[third++] = data[mid++];
            }
        }

        while(mid <= right){
            tmpArr[third++] = data[mid++];
        }

        while(left <= center){
            tmpArr[third++] = data[left++];
        }

        while(tmp <= right){
            data[tmp] = tmpArr[tmp++];
        }
    }



}
