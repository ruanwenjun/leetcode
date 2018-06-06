/**
 * 旋转图像
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-05 18:51
 */

public class Problem48 {
    /**
     * 顺时针旋转90度
     * a[i][j] 到 a[j][i]
     * a[i][j] 到 a[
     *
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        // 旋转外圈，然后旋转内圈
        // 最大行
        int row = matrix.length;
        if (row <= 0) {
            return;
        }
        // 最大列
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            int index = 0;
            // 依次旋转每一圈的行列
            for (int j = i; j < col - 1; j++) {
                int tem = matrix[j][col - 1];
                matrix[j][col - 1] = matrix[i][j];

                int tem2 = matrix[row - 1][col - index - 1];
                matrix[row - 1][col - index - 1] = tem;

                tem = matrix[row - 1 - index][i];
                matrix[row - 1 - index][i] = tem2;

                matrix[i][j] = tem;
                index ++;
            }
            row--;
            col--;
        }
    }

    public static void main(String[] args) {
        Problem48 p = new Problem48();
        int[][] maxtrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        p.rotate(maxtrix);
    }
}
