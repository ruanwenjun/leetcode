import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;

/**
 * 推多米咯
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-20 10:27
 */

public class Problem838 {
    /**
     * L表示左R表示右.表示没有推动
     *
     * @param dominoes
     * @return
     */
    public String pushDominoes(String dominoes) {
        // 遍历字符串，当发现R的时候找他右边的L
        char[] chars = dominoes.toCharArray();
        // 表示在此之前是否有R
        boolean hasR = false;
        // 之前的位置
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                if (!hasR) {
                    for (int j = index; j <= i; j++) {
                        chars[j] = 'L';
                    }
                    index = i;
                } else {
                    int start = index;
                    int end = i;
                    index = end;
                    for (; start < end; ) {
                        chars[start++] = 'R';
                        chars[end--] = 'L';
                    }
                    hasR = false;

                }
            }
            if (chars[i] == 'R') {
                // 往后面找L
                hasR = true;
                index = i;
            }
        }

        for (int i = 0;i<chars.length;i++){
            if(chars[i] == 'R' && i+1<chars.length &&chars[i+1] == '.'){
                if(i+2<chars.length&&chars[i+2] != 'L' || i+2>=chars.length){
                    chars[i+1] = 'R';
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Problem838 p = new Problem838();
        String s = p.pushDominoes("R.R.L");
        System.out.println(s);
    }
}
