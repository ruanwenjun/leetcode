import java.util.ArrayList;
import java.util.List;

/**
 * 保持城市天际线
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-02 11:14
 */

public class Problem807 {
    /**
     * 思路：先找出每一行的最大值跟每一列的最大值
     * 然后遍历数组，每个元素最后的高度是该元素所在行、列最大值的小的那一个
     *
     * @param grid
     * @return
     */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        // 保存每一行最大值
        int[] maxRows = new int[grid.length];
        // 保存每一列的最大值
        List<Integer> maxCols = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(maxRows[i] < grid[i][j]){
                    maxRows[i] = grid[i][j];
                }
                if(maxCols.size()<=j){
                    maxCols.add(grid[i][j]);
                }else {
                    if(maxCols.get(j) < grid[i][j]){
                        maxCols.remove(j);
                        maxCols.add(j,grid[i][j]);

                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i  < grid.length;i++){
            for (int j = 0;j<grid[i].length;j++){

                count += Math.min(maxRows[i],maxCols.get(j)) - grid[i][j];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][] grid = new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        Problem807 p = new Problem807();
        int i = p.maxIncreaseKeepingSkyline(grid);
        System.out.println(i);
    }
}
