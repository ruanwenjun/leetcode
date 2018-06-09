import java.util.ArrayList;
import java.util.List;

/**
 * 数组中重复的数据
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-08 21:32
 */

public class Problem442 {
    /**
     * 数组中的元素出现两次或一次
     * 找出数组中出现两次的元素
     * 每个元素的值在1-n之间
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // 从遍历数组，如果当前的数的索引不等于当前的话，那么就将当前的数换到属于它的位置
        for (int i = 0; i < nums.length; i++) {
            while (nums[nums[i] - 1] != nums[i]) {
                int tem = nums[i];
                // 交换
                nums[i] = nums[nums[i] - 1];
                nums[tem - 1] = tem;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1 && nums[nums[i] - 1] == nums[i]){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Problem442 p = new Problem442();
        int[] num = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> duplicates = p.findDuplicates(num);
        System.out.println(duplicates);
    }
}
