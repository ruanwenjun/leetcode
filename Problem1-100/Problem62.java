/**
 * 不同路径
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 13:39
 */

public class Problem62 {

    /**
     * 找出从左上角到右下角的路径，只能向右或向下
     * 思路：每次都有两种情况向右或者向下，向右的话就变成m-1 n,向下的话就变成m n-1
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        // 记录规模为m n 的路径数
        int[][] path = new int[m + 1][n + 1];
        for (int i = 1;i<=m;i++){
            path[i][1] = 1;
        }
        for (int i = 1; i <=n; i ++){
            path[1][i] = 1;
        }
        for (int i = 2; i <=n; i ++){
            for (int j = 2; j <= m; j ++){
                path[j][i] = path[j-1][i] + path[j][i-1];
            }
        }
        return path[m][n];
    }

    public static void main(String[] args) {
        Problem62 p = new Problem62();
        int i = p.uniquePaths(1, 1);
        System.out.println(i);
    }
}
