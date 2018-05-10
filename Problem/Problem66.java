import java.util.Arrays;
import java.util.Collections;

/**
 * 加一
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 18:42
 */

public class Problem66 {
    /**
     * 在该数的基础上加1
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        // 从高位遍历数组即可
        int index = 0;
        for (int i = digits.length-1;i>=0;i--){
            // +1
            if(i == digits.length -1){
                int j = digits[i] +1;
                if(j>=10){
                    digits[i] = j - 10;
                    // 表示进位
                    index = 1;
                }else {
                    digits[i] = j;
                    break;
                }
            }else {
                // 查看当前是否有进位
                if(index == 0){
                    // 没有进位直接退出
                    break;
                }else {
                    // 有进位
                    int j = digits[i] +1;
                    if(j>=10){
                        digits[i] = j - 10;
                        // 表示进位
                        index = 1;
                    }else {
                        digits[i] = j;
                        index = 0;
                        break;
                    }
                }
            }
        }
        // 查看是否还有进位
        if(index == 1){
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for (int i =0;i<digits.length;i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        Problem66 p = new Problem66();
        int[] a = new int[]{9,9};
        int[] ints = p.plusOne(a);
        System.out.println(Arrays.toString(ints));
    }
}
