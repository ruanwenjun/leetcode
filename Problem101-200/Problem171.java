/**
 * Excel表序列号
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 20:26
 */

public class Problem171 {
    /**
     * 返回字符串代表的excel的序列号
     * A-Z 1-26
     * AA 27 AB 28 AZ 27 + 25 = 52
     * BA 26*2+1 = 53 BZ 53 +25 = 78
     *
     * @param s
     * @return
     */
    public int titleToNumber(String s) {
        // 先判断长度  如果是两位的话：第一位-'A *26 + 第二位
        // 每一位 - A *26 的 n-1 次方
        char[] chars = s.toCharArray();
        int length = chars.length;
        int index = 1;
        int result = 0;
        // 从右往左
        for (int i = length - 1; i >= 0; i--) {
            result += (chars[i] - 'A' + 1)*index;
            index *= 26;
        }
        return  result;
    }
}
