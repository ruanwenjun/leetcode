/**
 * 丑数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-12 12:47
 */

public class Problem263 {
    /**
     * 判断是不是丑数
     * 只包含质因子235的正整数
     * 1是丑数
     *
     * @param num
     * @return
     */
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        if (num == 2 || num == 3 || num == 5 || num == 1) {
            return true;
        }
        int i = 2;
        while (i <= 5) {
            while (num % i == 0) {
                return isUgly(num / i);
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Problem263 p = new Problem263();
        boolean ugly = p.isUgly(905391974);
        System.out.println(ugly);
    }

}
