import java.util.ArrayList;
import java.util.List;

/**
 * 三角形的最小路径和
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 13:17
 */

public class Problem120 {
    /**
     * 求出自顶向下的最小路径和，每一次只能移动到相邻的两个
     * 思路：如果当前是最小路径，那么一定包含它的下一层的最小路径
     * 即min = list[0] + min (left,right)
     * 采用自底向上一次更新每一层的每个位置的最小路径
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0){
            return 0;
        }
        // 采用自底向上的计算
        List<Integer> list;
        List<Integer> index = null;
        for (int i = triangle.size() - 2; i >= 0; i--) {
            // 下一层
            list = triangle.get(i + 1);
            // 当前层
            index = triangle.get(i);
            for (int j = 0; j < index.size(); j++) {
                index.set(j, index.get(j) + Math.min(list.get(j), list.get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {

    }
}
