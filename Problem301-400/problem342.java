/**
 * 4的幂
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 19:33
 */

public class problem342 {
    /**
     * 判断一个数是否为4的幂
     * @param num
     * @return
     */
    public boolean isPowerOfFour(int num) {
        String string = Integer.toBinaryString(num);
        // 当string上只有1个1，且在第2n个位置
        if(string.length()%2==1 && string.lastIndexOf("1")==0){
            return true;
        }
        return false;
    }
}
