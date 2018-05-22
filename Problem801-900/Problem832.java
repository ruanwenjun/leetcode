/**
 * 反转图像
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-21 21:50
 */

public class Problem832 {
    /**
     * 给定一个矩阵，先水平翻转，在将0换成11换成0
     *
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int len = A[i].length -1 ;
            if(A[i].length%2 != 0){
                if(A[i][len/2] == 0){
                    A[i][len/2] = 1;
                }else {
                    A[i][len/2] = 0;
                }
            }
            for (int j = 0; j < len; j++,len--) {
                if(A[i][j] == 0){
                    A[i][j] = 1;
                }else {
                    A[i][j] = 0;
                }
                if(A[i][len] == 0){
                    A[i][len] = 1;
                }else {
                    A[i][len] = 0;
                }
                int tem = A[i][j];
                A[i][j] = A[i][len];
                A[i][len] = tem;
            }
        }
        return A;
    }
}
