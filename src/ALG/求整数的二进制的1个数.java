package ALG;

public class 求整数的二进制的1个数 {

    public static void main(String[] args) {
        System.out.println(8<<1);
        System.out.println(numberOfOne2(15));
    }

    public static int numberOfOne(int n ){
        int count = 0;

        for(int i = 0;i<32;i++){
            count += (n&1);
            n >>= 1;
        }

        return count;
    }

    public static int numberOfOne2(int n ){
        int count = 0;

        while(n != 0){
            count++;
            n = (n-1) & n;
        }

        return count;
    }
}
