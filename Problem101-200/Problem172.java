import javax.swing.*;
import java.math.BigInteger;
import java.util.concurrent.BrokenBarrierException;

/**
 * 阶乘后的零
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-11 18:34
 */

public class Problem172 {

    /**
     * 返回N阶乘后尾数0的个数
     * 时间复杂度应该是log N
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int num = 0;
        // 采用分冶法的思想
        while (n != 0) {
            num += n / 5;
            n = n / 5;


        }
        return num;
    }

    public static void main(String[] args) {
        Problem172 p = new Problem172();
        int i = p.trailingZeroes(50);
        System.out.println(i);
        System.out.println(1808548329 * 1808548328);

    }
}
