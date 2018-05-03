import java.util.ArrayList;
import java.util.List;

/**
 * 字符数组最短距离
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 18:15
 */

public class Problem821 {
    /**
     * 求字符串中每个字母到c的最短距离
     *
     * @param S
     * @param C
     * @return
     */
    public int[] shortestToChar(String S, char C) {
        char[] charsS = S.toCharArray();
        // 遍历一遍找到所有的c
        List<Integer> list = new ArrayList<>();
        int[] result = new int[charsS.length];
        for (int i = 0; i < charsS.length; i++) {
            if (charsS[i] == C) {
                list.add(i);
            }
        }
        for (int i = 0; i < charsS.length; i++) {
            int min = 10000;
            // 遍历
            for (Integer integer : list) {
                min = Math.min(Math.abs(integer-i),min);
            }
            result[i] = min;
        }
        return result;

    }
}
