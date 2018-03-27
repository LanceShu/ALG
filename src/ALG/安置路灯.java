package ALG;

import java.util.Scanner;

public class 安置路灯 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            int m=sc.nextInt();
            String s=sc.next();
            int r = 0;
            for (int j=0;j<s.length();j++) {
                if (s.charAt(j) == '.') {
                    r++;
                    j+=2;
                }
            }

            System.out.println(r);
        }

    }
}
