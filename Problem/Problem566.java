/**
 * 重塑矩阵
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 11:49
 */

public class Problem566 {
    /**
     * 将二维矩阵重塑为新矩阵，并且需要具有相同的行遍历
     * r 新矩阵的行
     * c 新矩阵的列
     * 如果不能重塑，则输出原矩阵
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // 判断能否重塑
        int rows = nums.length;
        int clums = nums[0].length;
        if(r * c == rows*clums){
            // 开始重塑
            int [][] result = new int[r][c];
            // 记录原矩阵当前的行
            int x = 0;
            // 记录原矩阵当前的列
            int y = 0;
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    if(y < clums){
                        result[i][j] = nums[x][y];
                        y++;
                        continue;
                    }
                    x++;
                    y = 0;
                    j--;
                }
            }
            nums = result;
        }
            return  nums;
    }

}
