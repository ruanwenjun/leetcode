/**
 * 有效的完全平方数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 18:07
 */

public class Problem367 {
    /**
     * 判断是不是完全平方数
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        // 如果是1 则返回
        if(num == 1){
            return true;
        }
        // 遍历
        for (int i =1;i<num/2;i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}
