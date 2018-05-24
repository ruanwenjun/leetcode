import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.Arrays;

/**
 * 最长和谐子序列
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-23 13:40
 */

public class Problem594 {
    /**
     * 和谐数组是最大和最小元素之差为1
     * 输出数组中最长和谐子序列的长度
     *
     * @param nums
     * @return
     */
    public int findLHS(int[] nums) {
        // 对数组排序，找到连续两个的长度
        Arrays.sort(nums);
        // 当前长度
        int index = 0;
        // 前一个的长度
        int pre = 0;
        // 前一个的值
        int preNum = 0;
        // 最大长度
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            index = 1;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                index ++;
                i++;
            }
            if(pre == 0){
                pre = index;
                preNum = nums[i];
            }else {
                if(preNum+1 == nums[i]){
                    max = Math.max(max,pre+index);
                }
                pre = index;
                preNum = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Problem594 p = new Problem594();
        int[] a = new int[]{1,1,1,1,3,2};
        int lhs = p.findLHS(a);
        System.out.println(lhs);
    }
}
