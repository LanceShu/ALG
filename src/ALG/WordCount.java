package ALG;

import java.util.*;

/**
 * 题目描述
 有一篇文章只包含英文单词，请按它们的出现次数排序，出现最多的先输出；如果出现次数相等的，按字符串ASCII排序升序输出。输出排序前K项
 输入描述:
 第一行会是行数N ( 0 < N <= 500)
 之后N行中的每行第一个字段是数字X (0 <= X <= 500)，表示该行后面有X个单词。数字与单词间，单词与单词间均以空格分隔。
 N行后会有一行，包含数字K ( 0 < K <= N)
 数据总大小不超过100K
 输出描述:
 <单词1><空格><次数1>
 <单词2><空格><次数2>
 示例1
 输入
 3
 3 SQL DW AND
 1 AND
 3 SQL SQL DW
 2
 输出
 SQL 3
 AND 2
 * */

public class WordCount {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int n = input.nextInt();
            for (int j = 0; j < n; j++) {
                String s = input.next();
                if (map.get(s) == null) {
                    map.put(s, 1);
                } else {
                    int k = map.get(s);
                    map.put(s, ++ k);
                }
            }
        }
        int K = input.nextInt();
        List<Word> words = new ArrayList<>();
        for (String s : map.keySet()) {
            words.add(new Word(s, map.get(s)));
        }

        for (int i = 0; i < words.size(); i++) {
            Word word = new Word();
            for (int j = 0; j < words.size() - 1 - i; j++) {
                if(words.get(j).count > words.get(j+1).count) {
                    word = words.get(j);
                    words.set(j, words.get(j+1));
                    words.set(j+1, word);
                }

                if (words.get(j).count == words.get(j+1).count) {
                    if (words.get(j).word.compareToIgnoreCase(words.get(j+1).word) < 0) {
                        word = words.get(j);
                        words.set(j, words.get(j+1));
                        words.set(j+1, word);
                    }
                }
            }
        }

        for (int i = words.size() - 1; i >= words.size() - K; i --) {
            System.out.println(words.get(i).word + " " + words.get(i).count);
        }
        return;
    }

    static class Word{
        String word;
        int count;

        Word(){}
        Word(String word, int count){
            this.word = word;
            this.count = count;
        }
    }
}
