/**
 * 各位相加
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 13:00
 */

public class Problem258 {
    /**
     * 将每一位数字相加，直到只有一个数字为止
     * @param num
     * @return
     */
    public int addDigits(int num) {
        // 当num有两位的时候循环
        while(num >= 10){
            // 将每一位相加
            int count = 0;
            while (num != 0){
                count += num % 10;
                num = num / 10;
            }
            num = count;
        }
        return num;
    }
}
