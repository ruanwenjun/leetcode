/**
 * 最小路径和
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-06 17:16
 */

public class Problem64 {
    /**
     * 找出从左上角到右下角最短路径和
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        if(grid.length == 0){
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        // 先更新第一行的最短
        for (int i = 1; i < col; i ++){
            grid[0][i] += grid[0][i - 1];
        }
        // 更新第一列的值
        for (int j = 1; j < row; j ++){
            grid[j][0] += grid[j - 1][0];
        }
        // 更新每一行当前的最短
        for (int i = 1; i < row; i ++){
            for (int j = 1; j < col; j ++){
                grid[i][j] += Math.min(grid[i - 1][j],grid[i][j - 1]) ;
            }
        }
        return grid[row - 1][col - 1];
    }
}
