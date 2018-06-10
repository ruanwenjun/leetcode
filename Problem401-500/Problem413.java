/**
 * 等差数列划分
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-09 18:34
 */

public class Problem413 {
    /**
     * 找到数组中等差子数组的个数
     * 思路：找到当前元素开头的最长等差数组，如果一个数组是等差数组，那么它的连续子数组都是等差数组
     *
     * @param A
     * @return
     */
    public int numberOfArithmeticSlices(int[] A) {
        // 记录等差数组的个数
        int num = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                int j = i + 1;
                while ( j < A.length && A[j] - A[j - 1] == A[i] - A[i - 1]) {
                    j ++;
                }
                for (int k = i; k <=j-1;k++){
                    num += j - k ;
                }
                i = j + 1;
            }

        }
        return num;
    }

    public static void main(String[] args) {
        Problem413 p = new Problem413();
        int[] a = new int[]{1,2,3,4,5,0,1,2,3};
        int i = p.numberOfArithmeticSlices(a);
        System.out.println(i);
    }
}
