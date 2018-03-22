package ALG;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目描述：
 在十进制表示中，任意一个正整数都可以用字符‘0’-‘9’表示出来。但是当‘0’-‘9’这些字符每种字符的数量有限时，可能有些正整数就无法表示出来了。比如你有两个‘1’ ，一个‘2’ ，那么你能表示出 11，12，121 等等，但是无法表示出 10，122，200 等数。

 现在你手上拥有一些字符，它们都是‘0’-‘9’的字符。你可以选出其中一些字符然后将它们组合成一个数字，那么你所无法组成的最小的正整数是多少？

 输入
 第一行包含一个由字符’0’-‘9’组成的字符串，表示你可以使用的字符。

 · 1 ≤字符串长度≤ 1000

 输出
 输出你所无法组成的最小正整数。


 样例输入
 55

 样例输出
 1


 Hint
 Input Sample 2
 123456789
 Output Sample 2
 10
 * */

public class 数字字符 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] chars = s.toCharArray();
        calculate(chars);
    }

    private static void calculate(char[] chars) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i + "", 0);
        }
        for (int i = 0; i < chars.length; i++) {
            int count = map.get(chars[i]+"");
            map.put(chars[i]+"", ++count);
        }

//        for (String key : map.keySet()) {
//            System.out.println(key + "..." + map.get(key));
//        }

        for (int i = 1;; i++) {
            int num = i;
            int result = num;
            int[] map1 = new int[10];
            for (int x= 0; x < 10; x ++) {
                map1[x] = map.get(x + "");
            }
            while(num != 0) {
                int j = num % 10;
                if(map1[j] == 0) {
                    System.out.println(result);
                    return;
                } else {
                    map1[j] --;
                }
                num = num / 10;
            }
        }
    }
}
