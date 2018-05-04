/**
 * 范围求和二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 13:41
 */

public class Problem598 {
    /**
     * 返回矩阵中含有最大整数的元素个数
     *
     * @param m
     * @param n
     * @param ops
     * @return
     */
    public int maxCount(int m, int n, int[][] ops) {
        // 遍历操作数组，找到最小的a,b




        int num = 0;
        int length = ops.length;
        int a = m;
        int b = n;
        for (int i = 0; i < length; i++) {
            a = Math.min(ops[i][0],a);
            b = Math.min(ops[i][1],b);
        }

        return a*b;
    }
}
