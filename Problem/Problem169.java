import java.util.HashMap;
import java.util.Map;

/**
 * 求众数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 13:02
 */

public class Problem169 {
    /**
     * 众数指在数组中出现次数大于N/2的数
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        // 使用一个map来保存数的出现次数
        Map<Integer,Integer> map = new HashMap<>();
        for (int n : nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
                if(map.get(n) > nums.length/2){
                    return n;
                }
            }else{
                map.put(n,1);
            }
        }
        // 当数组中只有一个元素的时候
        return nums[0];
    }
}
