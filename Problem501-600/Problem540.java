/**
 * 有序数组中的单一元素
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-09 18:57
 */

public class Problem540 {
    /**
     * 有序数组中只有一个数出现一次，其他数出现两次，找出出现一次的数
     *
     * @param nums
     * @return
     */
    public int singleNonDuplicate(int[] nums) {
        // 数组长度必然是奇数
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {
            mid = start + (end - start) / 2;
//            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
//                return nums[mid];
//            }
//            if(end - start == 2){
//                if(nums[start] == nums[start + 1]){
//                    return nums[end];
//                }else {
//                    return nums[start];
//                }
//            }
            if(nums[mid] == nums[mid - 1] && (mid - start)%2 == 0){
                end = mid - 2;
            }else if (nums[mid] == nums[mid - 1]){
                start = mid + 1;
            }else if(nums[mid] == nums[mid + 1] && (end - mid)%2 == 0){
                start = mid + 2;
            }else {
                end = mid - 1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        Problem540 p = new Problem540();
        int[] a = new int[]{0,1,1,2,2,5,5,3,3,4,4};
        int i = p.singleNonDuplicate(a);
        System.out.println(i);
    }
}
