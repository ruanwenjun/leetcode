import java.util.Arrays;

/**
 * 分发饼干
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 12:39
 */

public class Problem455 {
    /**
     * s是饼干
     * g是小朋友的胃口值
     * 每个小朋友最多只能拥有1块饼干
     * 求最多可以满足多少小朋友
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        // 将s排序，遍历s然后满足g
        Arrays.sort(s);
        Arrays.sort(g);
        int count = 0;
        int now = 0;
        for (int index : s){
            // 满足g,并且标记孩子已经满足了
            for (int i =now;i<g.length;i++){
                if(index>=g[i]){
                    count ++ ;
                    now = i + 1  ;
                    break;
                }
            }
        }
        return count;
    }
}
