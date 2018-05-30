/**
 * 最短无序连续子数组
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-29 10:32
 */

public class Problem581 {
    /**
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        // 从左往右，如果比后面的小则跳过，如果比后面的大，那么当前的需要排序，并且找到当前后面的最小的然后往前找是否有比它小的
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                // 找到当前右边最小的
                int min = nums[i];
                int index = i;
                left = i - 1;
                while (index < nums.length) {
                    if (nums[index] < min) {
                        min = nums[index];
                    }
                    index++;
                }
                // 往前找知否有比min更小的
                while (i >= 0) {
                    if (nums[i] > min) {
                        left = i;
                    }
                    i--;
                }
                break;
            }
        }
        // 从右往左，如果比前面的大则跳过
        for (int i = nums.length - 2; i >= 0; i--) {
            if(nums[i]>nums[i+1]){
                int max = nums[i];
                right = i + 1;
                int index = i;
                // 找到前面最大的
                while (index>=0){
                    if(nums[index] > max){
                        max = nums[index];
                    }
                    index--;
                }
                // 往后找是否有比最大的还大
                while (i<nums.length){
                    if(nums[i] < max){
                        right = i;
                    }
                    i++;
                }
                break;
            }
        }
        if(left == right){
            return 0;
        }

        return right - left + 1;
    }

    public static void main(String[] args) {
        Problem581 p = new Problem581();
        int[] a = new int[]{2,1};
        int unsortedSubarray = p.findUnsortedSubarray(a);
        System.out.println(unsortedSubarray);
    }

}
