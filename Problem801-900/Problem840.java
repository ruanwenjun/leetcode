/**
 * 矩阵中的幻方
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-27 9:35
 */

public class Problem840 {
    /**
     * 判断有多少3 * 3 的幻方
     * 每行每列及对角线的和相等
     * 并且数字从1到9
     *
     * @param grid
     * @return
     */
    public int numMagicSquaresInside(int[][] grid) {
        // 遍历二维矩阵
        // 幻方数
        int result = 0;
        // 当前的和
        int index = 0;
        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid[i].length - 2; j++) {
                if(grid[i][j]>0 && grid[i][j]<10 && grid[i+1][j]>0&&grid[i+1][j]<10&&grid[i+2][j]>0&&grid[i+2][j]<10
                        &&grid[i][j+1]>0 && grid[i][j+1]<10 && grid[i+1][j+1]>0&&grid[i+1][j+1]<10&&grid[i+2][j+1]>0&&grid[i+2][j+1]<10
                        && grid[i][j+2]>0 && grid[i][j+2]<10 && grid[i+1][j+2]>0&&grid[i+1][j+2]<10&&grid[i+2][j+2]>0&&grid[i+2][j+2]<10){
                    // 第一行
                    index = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                    if (grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2] == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2]
                            && index == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2]) {
                        if (grid[i][j] + grid[i + 1][j] + grid[i + 2][j] == index
                                && grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] == index
                                && grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2] == index) {
                            if(grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2] == grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]
                                    && grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j] == index){
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
