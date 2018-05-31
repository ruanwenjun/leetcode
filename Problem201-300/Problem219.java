import java.util.HashMap;
import java.util.Map;

/**
 * 存在重复元素二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 13:38
 */

public class Problem219 {
    /**
     * 数组中是否存在两个元素相等，且索引差的绝对值为K
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 统计每个元素，并且记录他们的索引
        // 记录数和索引
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               // 取出索引
                index = map.get(nums[i]);
                if(i - index <= k){
                    return true;
                }
                if(i - index > k){
                    map.put(nums[i],i);
                }
            }else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
