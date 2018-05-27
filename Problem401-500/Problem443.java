import java.util.Calendar;

/**
 * 压缩字符串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-26 19:16
 */

public class Problem443 {
    /**
     * 使用原地算法将其压缩，返回压缩后的长度
     *
     * @param chars
     * @return
     */
    public int compress(char[] chars) {
        // 遍历数组，如果后一个等于当前的，找到连续的个数
        // 记录新数组的索引
        int index = -1;
        String num = new String();
        for (int i = 0; i < chars.length;) {
            // 记录重复字母的长度
            int j = 1;
            // 记录元素组遍历的索引
            int k = i + 1;
            while (k < chars.length && chars[k] == chars[i]) {
                j++;
                k++;
            }
            chars[++index] = chars[i];
            // 更新数组
            if (j > 1) {
                num = "" + j;
                for (int s = 0; s < num.length(); s++) {
                    chars[++index] = num.charAt(s);
                }
            }

            i = k;
        }
        return index +1;
    }

    public static void main(String[] args) {
        Problem443 p = new Problem443();
        char[] c = new char[]{'a','a','a','a' ,'b','b','a','a'};
        int compress = p.compress(c);
        System.out.println(compress);
    }
}
