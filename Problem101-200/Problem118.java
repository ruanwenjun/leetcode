import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 13:11
 */

public class Problem118 {
    /**
     * 输出杨辉三角的前numRows行
     *
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {

        // 结果
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = null;
        // 第N行有N个数，并且由前一行计算得出1。。。。1这种形式
        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                // 第一行
                list = new ArrayList<>();
                list.add(i);
            } else {
                // 不是第一行，需要取出最后一个元素
                List<Integer> integers = result.get(result.size() - 1);
                list = new ArrayList<>();
                list.add(1);
                // 加入除最后一行的元素
                for (int j = 0; j < integers.size() - 1; j++) {
                    list.add(integers.get(j) + integers.get(j + 1));
                }
                list.add(1);
            }
            result.add(list);
        }
        return result;
    }
}
