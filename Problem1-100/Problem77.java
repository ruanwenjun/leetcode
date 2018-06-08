import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-07 21:46
 */

public class Problem77 {
    List<List<Integer>> result = new ArrayList<>();
    /**
     * 返回 1 - N 中所有的可能的k个组合
     *
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) {
        // 思路：采用回溯法做
        if (k > n) {
            return null;
        }
        helper(new ArrayList<Integer>(),1,n,k);
        return result;
    }

    /**
     * @param index 当前的数字
     * @param k     组合中还需要添加的数字个数
     */
    public void helper(List<Integer> list, int index, int n, int k) {
        if (k == 0) {
            result.add(list);
            return;
        }

        for (int i = index; i <= n ; i ++){
            list.add(i);
            helper(new ArrayList<>(list),i + 1,n,k - 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Problem77 p = new Problem77();
        List<List<Integer>> combine = p.combine(1, 1);
        System.out.println(combine);
    }
}
