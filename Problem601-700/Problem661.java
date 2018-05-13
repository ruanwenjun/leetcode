/**
 * 图片平滑器
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 12:46
 */

public class Problem661 {
    /**
     * 求灰度
     * 灰度是周围8个+自身 的平均值向下取整
     *
     * @param M
     * @return
     */
    public int[][] imageSmoother(int[][] M) {
        int length = M.length;
        int width = M[0].length;
        // 结果
        int[][] result = new int[length][width];
        // 遍历这个二维矩阵
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = count(M, i, j);
            }
        }


        return result;
    }

    /**
     * 计算 i j 的灰度
     *
     * @param m
     * @param i
     * @param j
     * @return
     */
    private int count(int[][] m, int i, int j) {
        int count = m[i][j];
        int num = 1;
        int length = m.length;
        int width = m[0].length;
        if (i - 1 >= 0) {
            num++;
            count += m[i - 1][j];
            if (j - 1 >= 0) {
                num++;
                count += m[i - 1][j - 1];
            }
            if (j + 1 < width) {
                num++;
                count += m[i - 1][j + 1];
            }
        }
        if (j - 1 >= 0) {
            num++;
            count += m[i][j - 1];
        }
        if (j + 1 < width) {
            num++;
            count += m[i][j + 1];
        }
        if (i + 1 < length) {
            num++;
            count += m[i + 1][j];
            if (j - 1 >= 0) {
                num++;
                count += m[i + 1][j - 1];
            }
            if (j + 1 < width) {
                num++;
                count += m[i + 1][j + 1];
            }
        }
        return count / num;

    }
}
