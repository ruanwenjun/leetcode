/**
 * 岛屿的最大面积
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 17:36
 */

public class Problem695 {
    /**
     * 求岛屿的最大面积
     * 岛屿是由水平或垂直的1构成的
     *
     * @param grid
     * @return
     */
    public int maxAreaOfIsland(int[][] grid) {
        // 记录岛屿的最大面积
        int size = 0;
        int length = grid.length;
        if (length == 0) {
            return 0;
        }
        int width = grid[0].length;
        // 遍历二维数组，求面积，与最大面积比较
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width;j++ ) {
                int index = 0;
                if(grid[i][j] == 0){
                    size = Math.max(size,index);
                }else {
                    // 计算当前连续的有多少个是1,不计算左边跟上面的
                    index = DP(grid,i,j);
                    size = Math.max(size,index);
                }
            }
        }
        return size;
    }

    /**
     * 从 i j 索引处开始进行深度遍历
     * @param grid
     * @param i
     * @param j
     * @return
     */
    public int DP(int[][] grid,int i,int j){
        // 记录当前的岛屿数
        int count = 1;
        //将当前置为0，标识已经遍历过
        grid[i][j] = 0;
        if(i+1<grid.length && grid[i+1][j] == 1 ){
            count +=DP(grid,i+1,j);
        }
        if(i-1>=0 && grid[i-1][j] == 1){
            count +=DP(grid,i-1,j);
        }
        if(j+1<grid[0].length && grid[i][j+1] == 1){
            count +=DP(grid,i,j+1);
        }
        if( j -1 >=0 && grid[i][j-1] == 1){
            count +=DP(grid,i,j-1);
        }
        return count;
    }
}
