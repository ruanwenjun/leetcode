/**
 * 错误的集合
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 16:52
 */

public class Problem645 {
    /**
     * 找到集合重复的整数，并且找到丢失的整数
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        // 使用hash
        int[] index = new int[nums.length + 1];
        int [] result = new int[2];
        for (int i = 0;i<nums.length;i++){
            index[nums[i]]++;
        }
        for (int i =1;i<index.length;i++){
            if(index[i] == 2){
                result[0] = i;
            }
            if(index[i] == 0){
                result[1] = i;
            }
        }
        return result;
    }
}
