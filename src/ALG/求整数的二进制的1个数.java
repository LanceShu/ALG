package ALG;

public class 求整数的二进制的1个数 {

    public static void main(String[] args) {
        System.out.println(numberOfOne(15));
    }

    public static int numberOfOne(int n ){
        int count = 0;

        for(int i = 0;i<32;i++){
            count += (n&1);
            n >>= 1;
        }

        return count;
    }
}
