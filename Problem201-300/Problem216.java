import java.util.ArrayList;
import java.util.List;

/**
 * 组合总和三
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 20:36
 */

public class Problem216 {
    List<List<Integer>> result;

    /**
     * 找到总和为n的k个数的组合
     *
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        result = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            number.add(i);
        }
        List<Integer> index = new ArrayList<>();
        sum(k, n, index, number);
        return result;
    }

    /**
     * 从列表中找到总和为n的k个数的情况
     *
     * @param k
     * @param n
     * @param list
     * @return
     */
    public void sum(int k, int n, List<Integer> list, List<Integer> number) {
        if (n == 0 && k == 0) {
            result.add(list);
            return;
        }
        List<Integer> indexNumber = new ArrayList<>(number);
        for (int i = 0; i < number.size(); i++) {
            // 遍历列表
            Integer integer = number.get(i);
            if (integer <= n && integer != 0) {
                indexNumber.remove(integer);
                List<Integer> indexList = new ArrayList<>(list);
                indexList.add(integer);
                sum(k - 1, n - integer, indexList, indexNumber);
            }
        }
    }

    public static void main(String[] args) {
        Problem216 p = new Problem216();
        List<List<Integer>> list = p.combinationSum3(3, 9);
        System.out.println(list);
    }
}
