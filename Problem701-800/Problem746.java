import java.io.InputStream;

/**
 * 使用最小花费爬楼梯
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 12:21
 */

public class Problem746 {
    // 保存当前索引开始爬完的最小花费
    int[] min;

    /**
     * 爬楼梯，可以选择爬1个或者爬两个
     * 可以选择0 或 1作为开始
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        // 使用动态规划来做
        min = new int[cost.length];
        if (cost.length < 2) {
            return cost[0];
        }
        init(cost, 0);
        return Math.min(min[0], min[1]);
    }

    /**
     * 计算从每一步开始的最短花费
     * 第i步开始的最短花费为cost[i]+min(min[i-],min[i-2]
     *
     * @param]
     */
    public int init(int[] cost, int i) {
        if (i >= cost.length) {
            return Integer.MAX_VALUE;
        }
        if (min[i] == 0) {
            // 当前的未知
            if (i + 1 < cost.length && i + 2 < cost.length) {
                min[i] = cost[i] + Math.min(init(cost, i + 1), init(cost, i + 2));

            } else {
                min[i] = cost[i];
            }
        }
        return min[i];
    }

    public static void main(String[] args) {
        Problem746 p = new Problem746();
        int[] a = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int i = p.minCostClimbingStairs(a);
        System.out.println(i);
    }
}
