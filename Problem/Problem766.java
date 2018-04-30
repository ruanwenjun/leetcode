/**
 * 托普利茨矩阵
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 19:12
 */

public class Problem766 {
    /**
     * 当矩阵从左到右每一条对角线上的元素都相等的时候，返回true
     *
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        // 行遍历
        // 每一行只判断它与它下面一行对应的元素是否相等
        for (int i = 0; i < matrix.length -1; i++) {
            // 列遍历
            for(int j = 0;j < matrix[i].length; j++){

                if(j+1<matrix[i].length && matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }

            }
        }
        return true;
    }
}
