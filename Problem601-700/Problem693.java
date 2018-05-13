/**
 * 交替位二进制数
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-27 13:07
 */

public class Problem693 {
    /**
     * 二进制数相邻两位永不相等即输出true
     *
     * @param
     * @return
     */
    public boolean hasAlternatingBits(int n) {
        //将N转换为二进制数
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        for(int i = 1;i<chars.length;i++) {
            if (chars[i - 1] == chars[i]) {
                return false;
            }
        }
        return true;
    }
}
