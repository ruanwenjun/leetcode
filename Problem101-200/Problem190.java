import java.sql.SQLOutput;

/**
 * 颠倒二进制位
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-23 17:04
 */

public class Problem190 {
    /**
     * 颠倒一个无符号32位整数的二进制位，然后变成十进制输出
     *
     * @param n
     * @return
     */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int value = 0;
        for (int i = 0;i<32;i++){
            if((n & 1) == 1){
                value =(value<< 1) + 1;
            }else {
                value = value<<1;
            }
            n = n >>1;
        }
        return value;
    }

    public static void main(String[] args) {
        Problem190 p = new Problem190();
        int i = p.reverseBits(43261596);
        System.out.println(i);
    }

}
