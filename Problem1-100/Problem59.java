import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 螺旋矩阵
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-05 18:29
 */

public class Problem59 {
    /**
     *
     * 输出从1-n^2的螺旋矩阵
     * n = 3
     * 1,2,3
     * 8,9,4
     * 7,6,5
     * @param n
     * @return
     */
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        // 每次填充一圈
        // 行
        int row = n;
        // 列
        int col = n;
        int index = 1;
        for (int i = 0; i < row; i ++){
            for (int j = i; j < col; j++){
                result[i][j] = index;
                index ++;
            }
            for (int k = i + 1; k < row; k++){
                result[k][col - 1] = index;
                index ++;
            }
            for (int l = col - 2; l >= n - col; l -- ){
                result[row - 1][l] = index;
                index ++;
            }
            for (int m = row - 2; m > i; m --){
                result[m][n - col] = index;
                index ++;
            }
            row --;
            col --;
        }
        return result;
    }

    public static void main(String[] args) {
        Problem59 p = new Problem59();
        int[][] ints = p.generateMatrix(3);
        System.out.println(Arrays.toString(ints));
    }
}
