import java.util.Arrays;

/**
 * 回旋镖的数量
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 13:00
 */

public class Problem447 {
    /**
     * 求回旋镖的数量
     *
     * @param points
     * @return
     */
    public int numberOfBoomerangs(int[][] points) {
        // 给定的N对不同点
        int n = points.length;
        // 计算出每一对点的距离为 第i个点到第j个点的距离为 len[i][j] = len[j][i]
        double[][] len = new double[n][n];
        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            // 计算到它后面的点的距离
            for (int j = i + 1; j < n; j++) {
                int o = points[j][0];
                int p = points[j][1];
                // 第 i 个点到第j个点的距离
                len[i][j] = len[j][i] = Math.sqrt((x - o) * (x - o) + (y - p) * (y - p));
            }
        }
        // 遍历二维数组
        int count = 0;
        for (int i = 0; i < n; i++) {
            // 对当前数组进行排序
            Arrays.sort(len[i]);
            for (int j = 0; j < n; j++) {
                int num = 0;
                while (j + 1 < n && len[i][j] == len[i][j + 1]) {
                    num++;
                    j++;
                }
                if(num != 0){
                    num ++;
                    count += num*(num-1);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem447 p = new Problem447();
        int [][] t = new int[][]{{0,0},{1,0},{-1,0},{0,1},{0,-1}};

        System.out.println(p.numberOfBoomerangs(t));
    }
}
