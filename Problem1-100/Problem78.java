import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-02 13:35
 */

public class Problem78 {
    /**
     * nums是一个不包含重复元素的数组
     * 输出nums的子集
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        // 开始加入所有元素，然后每次遍历列表从里面拿出元素加上当前的元素
        List<List<Integer>> subList = new ArrayList<>();
        subList.add(new ArrayList<>());
        for (int i  : nums){
            int len = subList.size();
            for (int j = 0;j<len;j++){
                List<Integer> list = subList.get(j);
                List<Integer> index = new ArrayList<>(list);
                index.add(i);
                subList.add(index);
            }
        }
        return subList;
    }

    public static void main(String[] args) {
        Problem78 p = new Problem78();
        int[] nums = new int[]{1,2,3,4};
        List<List<Integer>> subsets = p.subsets(nums);
        System.out.println(subsets);
    }
}
