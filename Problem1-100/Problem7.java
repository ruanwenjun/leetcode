/**
 * 反转整数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-26 15:12
 */

public class Problem7 {
    /**
     * 将32位有符号整数反转，如果益处返回0
     * @param x
     * @return
     */
    public int reverse(int x) {
        // 使用一个long型变量来保存
        long index = 0;
        while (x != 0){
            index = index * 10 + x %10;
            x = x / 10;
        }
        int result = (int) index;
        if(result != index){
            return 0;
        }
        return (int)index;
    }
}
