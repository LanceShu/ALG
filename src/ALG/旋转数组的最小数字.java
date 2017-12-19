package ALG;

public class 旋转数组的最小数字 {

    public static void main(String[] args) {
        int[] arrys = {3,4,5,1,2,3};
        System.out.println(min(arrys));
    }

    public static int min(int[] numbers){

        int lo = 0;
        int mi = lo;
        int hi = numbers.length-1;

        while(numbers[lo] >= numbers[hi]){

            if(hi - lo == 1){
                return numbers[hi];
            }

            mi = lo + (hi - lo)/2;

            if(numbers[mi] >= numbers[lo]){
                lo = mi;
            }else {
                hi = mi;
            }

        }

        return numbers[lo];

    }
}
