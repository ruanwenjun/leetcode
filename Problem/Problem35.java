/**
 * 搜索插入的位置
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 13:43
 */

public class Problem35 {
    /**
     * 如果数组中存在target那么返回索引
     * 如果不存在则返回插入的位置
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

        int index = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i]>target){
                index = i;
                break;
            }
            index ++;
        }
        return index;
    }

}
