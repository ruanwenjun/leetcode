import com.sun.javadoc.SeeTag;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 最大子序和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-10 18:32
 */

public class Problem53 {

    /**
     * 找到最大和的连续子数组
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
            // 如果当前的count+nums[i]<0,跳过
            if(count+nums[i]<0){
                count = 0;
                continue;
            }
            if(count+nums[i]>=0){
                count +=nums[i];
                set.add(count);
            }
        }
        set.add(max);
        return set.last();
    }

    public static void main(String[] args) {
        Problem53 p = new Problem53();
        int[]a = new int[]{4,-1,2,1};
        System.out.println(p.maxSubArray(a));
    }

}
