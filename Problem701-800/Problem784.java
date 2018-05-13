import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字母大小写全排列
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 11:55
 */

public class Problem784 {
    /**
     * 返回S中大小写可能出现的全部字符串
     *
     * @param S
     * @return
     */
    public List<String> letterCasePermutation(String S) {
        // 找到所有的字母下标，然后从第一个开始找到所有的组合情况
        char[] chars = S.toCharArray();
        // 保存是字母的索引
        List<Integer> index = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                index.add(i);
            }
        }
        // 所有的情况是2 的 index.size次方
        result.add(S);
        for (int i = 0; i < index.size(); i++) {
            // 改变列表中的每一个第i个字母的大小写
            // 字母索引
            Integer j = index.get(i);
            // 当前字母不一样的版本
            char c = chars[j];
            // 改变当前字母的大小写
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            // 遍历列表,添加一个当前字母改变的版本
            int m = result.size();
            for (int k = 0; k < m; k++) {
                String s = result.get(k);
                String s1 = s.substring(0,j);
                s1 += c+"";
                if(j+1<chars.length){
                    s1 += s.substring(j+1, chars.length);
                }
                result.add(s1);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Problem784 p = new Problem784();
        p.letterCasePermutation("z1b2");
    }
}
