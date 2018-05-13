/**
 * 打家劫舍
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-12 13:04
 */

public class Problem198 {
    /**
     * 记录从第I天开始偷盗的总金额
     */
    int[] num ;
    /**
     * 能偷到的最大金额
     * 不能偷两间相邻的
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        num = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            num[i] = -1;
        }
        int rob1 = rob(0, nums);
        int rob2 = rob(1, nums);
        return Math.max(rob1,rob2);
    }

    /**
     * 从第I间开始能偷盗的最大金额之和
     * @param i
     * @param nums
     * @return
     */
    public int rob(int i,int[]nums){
        if(i>=nums.length){
            return 0;
        }
        int count = nums[i];
        int count1 = 0;
        if(i+2<num.length&&num[i+2] == -1){
            count1 = rob(i+2,nums);
            num[i+2] = count1;
        }else if (i+2<num.length){
            count1 = num[i+2];
        }
        int count2 = 0;
        if(i+1<num.length&&num[i+1] == -1){
            count2 = rob(i+1,nums);
            num[i+1] = count2;
        }else if (i+1<num.length){
            count2 = num[i+1];
        }
        return Math.max(count2,count+count1);
    }

    public static void main(String[] args) {
        Problem198 p = new Problem198();
        int[] a = new int[]{1,2,3,1};
        int rob = p.rob(a);
        System.out.println(rob);
    }
}
