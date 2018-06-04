import java.util.Arrays;

/**
 * 最大二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-03 12:22
 */

public class Problem654 {
    /**
     * 二叉树的根是数组中最大的元素
     * 二叉树的左子树的最大元素左边的部分
     * 右字数是最大元素右边的部分
     * 数组中不含重复元素
     * @param nums
     * @return
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        // 数组中最大的元素
        int max = nums[0];
        // 最大元素的索引
        int maxIndex = 0;
        for (int i = 1;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(max);
        if(maxIndex > 0){
            root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,maxIndex));
        }else {
            root.left = null;
        }

        if(maxIndex < nums.length-1){
            root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,maxIndex+1,nums.length));
        }else {
            root.right = null;
        }
        return root;
    }
}
