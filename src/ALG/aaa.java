package ALG;

public class aaa {
    public static void main(String[] args) {
//        int a0 = 40;
//        int b0 = 40;
//        Integer a = 40;
//        Integer b = 40;
//        Integer c = 128;
//        Integer d = 128;
//        System.out.println();
//        System.out.println("a=b\t" + (a == b));
//        System.out.println("c=d\t" + (c == d));
//        Integer e = 0;
//        System.out.println("a = b + e\t" + (c == (d + e)));
//
//        Double aa = 45.0;
//        Double bb = 45.0;
//        System.out.println("aa = bb\t" + (aa == bb));
//        short a = 1024;
//        short b = (short) (a << 5);
//        System.out.println(b);
//        short c = (short) (b >>> 5);
//        System.out.println(c);

        System.out.println(foo(17, 8));
    }

    public static int foo(int x, int y) {
        if (x <= 0 || y <= 0)
            return 1;
        else
            return 3 * foo(x - 6, y / 2);
    }
}
