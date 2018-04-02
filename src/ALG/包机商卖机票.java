package ALG;

import java.util.Scanner;

public class 包机商卖机票 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextLong();
        long s[]=new long[n];
        for (int i=0;i<n;i++) {
            s[i]=sc.nextLong();
        }

        boolean r =c(s,0,new long[n],0,m);

        if (r)
            System.out.print("perfect");
        else
            System.out.print("good");
    }

    static boolean c(long []src,int index,long []c,long sum,long max) {
        boolean r=false;

        if (index == src.length) {
            return false;
        }

        for (int i=c.length-1;i>=index;i--) {
            if (src[i] != -1) {
                c[i] = src[i];
                if (sum+ c[i] < max){
                    r = c(src, i + 1, c, sum + c[i], max);
                    if (r)
                        return true;
                }else if (sum + c[i] == max){
                    return true;
                }
            }
        }
        c[index] = 0;

        return false;
    }
}
