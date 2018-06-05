import java.util.ArrayList;
import java.util.List;

/**
 * 划分字母区间
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-04 20:53
 */

public class Problem763 {
    /**
     * 将字符串划分为尽可能多的区间
     * 每个字母只出现在其中一个区间
     * 输出每个区间的长度
     *
     * @param S
     * @return
     */
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        if (S == null) {
            return result;
        }
        // 存储字母的出现的最右索引
        int[] chars = new int[26];
        for (int i = 0; i < S.length(); i++) {
            if (chars[S.charAt(i) - 'a'] < i) {
                chars[S.charAt(i) - 'a'] = i;
            }
        }
        // 存储当前划分的长度
        int lentgh = 0;
        // 存储当前遍历过的字母中最右边的位置
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            lentgh ++;
            if(chars[S.charAt(i) - 'a'] > end){
                end = chars[S.charAt(i) - 'a'];
            }
            if(i == end && lentgh != 0){
                result.add(lentgh);
                lentgh = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem763 p = new Problem763();
        List<Integer> list = p.partitionLabels("abc");
        System.out.println(list);
    }
}
