package ALG;

public class 猴子吃桃 {
    public static void main(String[] args) {
        int m = 1;
        for (int i = 9; i > 0; i--) {
            m = (m + 1) * 2;
            System.out.println(i + "..." + m);
        }
    }
}
