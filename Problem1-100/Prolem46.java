import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-03 12:36
 */

public class Prolem46 {
    /**
     * 给定一个没有重复数字的数组
     * 返回所有的全排列
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        // 首先找到两个数的全排列，后面的每次增加一个数
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> index = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        result.add(first);

        // result 的大小
        int listSize;
        // 遍历数组元素

        for (int i = 1; i < nums.length; i++) {
            listSize = result.size();
            // 往每一个中间加一个
            for (int j = 0; j < listSize; j++) {
                List<Integer> list = result.get(j);
                for (int k = 0; k <= list.size(); k++) {
                    List<Integer> addList = new ArrayList<>(list);
                    addList.add(k, nums[i]);
                    index.add(addList);
                }
            }
            result = new ArrayList<>(index);
            index.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        Prolem46 p = new Prolem46();
        int[] a = new int[]{1};
        List<List<Integer>> permute = p.permute(a);
        System.out.println(permute);
    }
}
