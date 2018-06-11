/**
 * 有序矩阵中第K小的数
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 17:41
 */

public class Problem378 {
    /**
     * 返回矩阵中第K小的数
     * 1，5，9
     * 10，11，13
     * 12，13，15
     *
     * @param matrix
     * @param k
     * @return
     */
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length - 1][matrix.length - 1];
        while (low <= high){
            int cnt = 0;
            int mid = low + (high - low) / 2;
            // 找到小于mid的有多少个数
            int i = matrix.length - 1;
            int j = 0;
            while (i>= 0 && j < matrix.length){
                if(matrix[j][i] > mid){
                    i --;
                }else {
                    cnt += i + 1;
                    j ++;
                }
            }
            if(cnt >= k){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}
