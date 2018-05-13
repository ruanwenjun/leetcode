/**
 * 3的幂
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 12:48
 */

public class Problem326 {
    /**
     * 判断是不是3的幂
     * 能够不使用递归或者循环来判断吗
     *
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        while (n%3 == 0){
            n = n/3;
            if(n == 0){
                return true;
            }
        }
        return false;
    }


}
