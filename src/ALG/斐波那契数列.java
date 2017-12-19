package ALG;

public class 斐波那契数列 {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(fibonacci(n-1));
    }

    public static int fibonacci(int n){

        if(n < 0){
            throw new RuntimeException("error");
        }

        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }


}
