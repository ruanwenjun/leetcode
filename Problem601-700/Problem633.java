/**
 * 平方数之和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 17:02
 */

public class Problem633 {
    /**
     * 判断是否存在两个整数a,b使得他们的平方和为c
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        // a,b都小于等于根号c
        if (c == 0 || c == 1) {
            return true;
        }

        for (int i = 0; i <= Math.sqrt(c); i++) {
            int index = (int) Math.sqrt(c - i * i);
            if (index * index + i * i == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
