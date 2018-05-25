/**
 * 排列硬币
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 16:47
 */

public class Problem441 {
    /**
     * 给定n个硬币，返回完整阶梯行的行数
     * 阶梯行要求，第K行有K个
     * @param n
     * @return
     */
    public int arrangeCoins(int n) {
        // 标识第几行
        int i = 1;
        while (n>=i){
            n = n-i;
            i++;
        }
        return i - 1;
    }
}
