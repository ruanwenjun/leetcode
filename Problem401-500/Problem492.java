import java.util.ArrayList;
import java.util.List;

/**
 * 构造矩形
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 17:15
 */

public class Problem492 {
    /**
     * 要求矩形的面积等于area
     * 输出长宽，长应该大于等于宽
     * 长宽的差距应该尽可能小
     * @param area
     * @return
     */
    public int[] constructRectangle(int area) {
        // 记录当前的长宽之间的差距
        int min = Integer.MAX_VALUE;
        int [] result = new int[2];
        // 找到它所有的长宽的组合,i是宽
        for (int i =1;i<=area;i++){

            if(area%i ==0 && i<=area/i){
                int []a = new int[2];
                a[0] = area/i;
                a[1] = i;
                // 长宽相等
                if(area/i == i){
                    return a;
                }
                // 长宽不等
                if(area/i - i < min){
                    min = area/i - i;
                    result = a;
                }
            }

            if(i>area/i){
                break;
            }
        }
        return result;
    }
}
