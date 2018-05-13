/**
 * 二进制表示中质数个计算置位
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 17:52
 */

public class Problem762 {
    /**
     * 计算L到R之间置位为质数的个数
     * @param L
     * @param R
     * @return
     */
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        // 转为二进制然后看有多少个1
        for(int i = L;i<=R;i++){
            String string = Integer.toBinaryString(i);
            char[] chars = string.toCharArray();
            int num = 0;
            boolean is = true;
            for(char c : chars){
                if(c == '1'){
                    num++;
                }
            }
            // 判断num 是不是质数
            if(num == 1){
                continue;
            }
            if(num == 2){
                count ++;
                continue;
            }
            for (int j = 2;j< num ;j++){
                if(num%j == 0){
                    is = false;
                    break;
                }
            }
            if(is){
                count++;
            }

        }
        return count;
    }
}
