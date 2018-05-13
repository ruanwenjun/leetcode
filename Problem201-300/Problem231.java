/**
 * 2的幂
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 18:04
 */

public class Problem231 {
    /**
     * 判断一个数是否是2的幂
     *
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
        // 如果一个数是2的幂，那么它就只有1个1,那么它跟比他小的数做&运算
        int count = 0;
        if (n <= 0) {
            return false;
        }


        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count == 1 ? true : false;
    }

    public static void main(String[] args) {
        Problem231 p = new Problem231();
            boolean powerOfTwo = p.isPowerOfTwo(-2147483648);
            System.out.println(powerOfTwo);

    }
}
