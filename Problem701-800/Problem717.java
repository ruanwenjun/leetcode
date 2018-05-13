/**
 * 1比特与两比特字符
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 12:28
 */

public class Problem717 {
    /**
     * 1比特是0
     * 2比特是11、10
     * 最后一个字符是0
     * 求最后一个是是否必定为1比特
     * @param bits
     * @return
     */
    public boolean isOneBitCharacter(int[] bits) {
        // 遍历数组，如果是0则跳过并记录当前是0字符，如果是1 则跳过1位，并记录当前是1字符
        boolean is = true;
        for (int i =0;i<bits.length;){
            if(bits[i] == 0){
                is = true;
                i = i+1;
            }else {
                is = false;
                i = i+2;
            }
        }
        return is;
    }

    public static void main(String[] args) {
        Problem717 p = new Problem717();
        int [] a = new int[]{1,1,1,0};
        System.out.println(p.isOneBitCharacter(a));
    }
}
