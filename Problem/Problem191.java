/**
 * 位1的个数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 19:03
 */

public class Problem191 {
    /**
     * 输出N的二进制表示中1的个数
     *
     * @param n
     * @return
     */
    // you need to treat n as an unsigned value
    // 需要将N看作无符号值
    public int hammingWeight(long n) {
        Long l  = Long.valueOf(Math.abs(n));
        String string = Long.toBinaryString(l);
        int count = 0;
        // 判断s中1的个数
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem191 p = new Problem191();
        int i = p.hammingWeight(2147483648L);
        System.out.println(i);
    }
}
