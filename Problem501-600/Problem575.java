import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 分糖果
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 12:03
 */

public class Problem575 {
    /**
     * 返回妹妹可以获得的最大的糖果种类数
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        // 首先统计有多少种糖果
        // 1.糖果种类数大于妹妹可以获得的糖果数，返回妹妹可以获得的糖果数
        // 2.糖果种类数小于妹妹可以获得的糖果数，返回糖果种类数
        int num = candies.length/2;
        Set s = new HashSet<>();
        for(int c : candies){
            s.add(c);
        }
        int kind = s.size();
        return kind>num?num:kind;
    }
}
