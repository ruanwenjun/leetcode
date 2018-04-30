/**
 * 将有序数组转化为二叉搜索树
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 19:26
 */

public class Problem108 {
    /**
     * 将升序数组转化为平衡二叉树
     *
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        // 采用递归的方式做,找到中间的数作为二叉树的顶点，然后将数组分为两个数组
        int length = nums.length;
        if(length == 1){
            return new TreeNode(nums[0]);
        }
        int index = length / 2;
        TreeNode treeNode = null;
        if (index != 0) {
            treeNode = new TreeNode(nums[index]);
            // 将数组分割
            int[] left = new int[index];
            for (int i = 0; i < index; i++) {
                left[i] = nums[i];
            }
            int lengthRight = length - index - 1;
            int[] right = new int[lengthRight];
            for (int j = 0; j < lengthRight; j++) {
                right[j] = nums[index +1 +j];
            }
            treeNode.left = sortedArrayToBST(left);
            treeNode.right = sortedArrayToBST(right);
        }
        return treeNode;
    }

    public static void main(String[] args) {
        int [] t = new int[]{-10,-3,0,5,9};
        sortedArrayToBST(t);
    }
}
