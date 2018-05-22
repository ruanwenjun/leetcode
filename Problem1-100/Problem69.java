/**
 * x的平方根
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-21 22:03
 */

public class Problem69 {
    // 只返回整数部分
    public int mySqrt(int x) {

        int pre = 0;
        for (int i = 46340; i * i <= x; i++) {
            if (i * i < 0) {
                return i;
            }

            pre = i;
        }
        return pre;
    }

    public static void main(String[] args) {
        int x = 2147395600;

        Problem69 p = new Problem69();
        System.out.println(46341 * 46341);
    }
}
