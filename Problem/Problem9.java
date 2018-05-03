
/**
 * 回文数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 17:26
 */

public class Problem9 {
    /**
     * 判断一个数是否为回文数
     * 能不将正数转换为字符串解决吗？
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        int index = x;
        // 负数肯定不是
        if (x < 0) {
            return false;
        }
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return index == y ? true : false;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }

}
