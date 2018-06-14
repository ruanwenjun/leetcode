import java.util.GregorianCalendar;

/**
 * 不同路径二
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 16:11
 */

public class Problem63 {

    /**
     * 其中有障碍物，1代表障碍物
     *
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        // 记录从 i,j到右下角的路径数
        int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        for (int i = 0; i < row; i++) {
            path[i][col - 1] = 1;
        }
        for (int i = row -1; i >= 0; i --){
            if(obstacleGrid[i][col-1] == 1){
                // 把上面的都变为0
                while (i >=0){
                    path[i][col - 1] = 0;
                    i--;
                }
                break;
            }
        }

        for (int i = 0; i < col; i++) {
            path[row - 1][i] = 1;
        }
        for (int i = col -1; i >=0; i --){
            if(obstacleGrid[row -1][i] == 1){
                while (i >=0){
                    path[row -1][i] = 0;
                    i--;
                }
                break;
            }
        }

        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    path[i][j] = 0;
                    continue;
                }
                if (obstacleGrid[i][j + 1] != 1) {
                    path[i][j] += path[i][j + 1];
                }
                if (obstacleGrid[i + 1][j] != 1) {
                    path[i][j] += path[i + 1][j];
                }
            }
        }
        return path[0][0];
    }

    public static void main(String[] args) {
        Problem63 p = new Problem63();
        int[][] g = new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}, {1, 0}, {0, 0}, {0, 0}, {0, 0}, {1, 0}, {0, 1}, {0, 0}, {0, 0}, {1, 0}, {0, 0}, {0, 0}, {1, 0}, {0, 0}};
        int i = p.uniquePathsWithObstacles(g);
        System.out.println(i);
    }
}
