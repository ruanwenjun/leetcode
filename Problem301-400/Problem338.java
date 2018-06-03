import java.util.Arrays;

/**
 * Bit计位
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-02 13:11
 */

public class Problem338 {
    public int[] countBits(int num) {
        // 记录每个数的二进制位的1的个数
        int[] bits = new int[num + 1];
        int n = 0;
        if(num < 1){
            return bits;
        }
        for(int i = 1;i <= num;i = i*2){
            bits[i] =1;
            for (int j = i+1;j<= num && j < i*2;j++){
                // i 记录当前遍历的前一个2的幂
                bits[j] = bits[i] + bits[j-i];
            }
        }
        return bits;
    }

    public static void main(String[] args) {
        Problem338 p = new Problem338();
        int[] ints = p.countBits(15);
        System.out.println(Arrays.toString(ints));
    }
}
