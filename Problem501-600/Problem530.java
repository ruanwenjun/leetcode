/**
 * 二叉搜索树的最小绝对差
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 13:00
 */

public class Problem530 {
    /**
     * 求树中两个节点的差的绝对值的最小值
     * 所有节点非负
     *
     * @param root
     * @return
     */
    public static int getMinimumDifference(TreeNode root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
       // 采用递归
        // 父节点跟左边最大的之差 或者 付右边最小的跟父节点之差
        int minLeft = Integer.MAX_VALUE;
        int minRight = Integer.MAX_VALUE;
        if(root.left != null){
            // 找到左边最大的
            TreeNode left = root.left;
            while (left.right != null){
                left = left.right;
            }
            minLeft = root.val - left.val;
            minLeft = Math.min(minLeft,getMinimumDifference(root.left));
        }

        if(root.right != null){
            //找到右边最小的
            TreeNode right = root.right;
            while (right.left != null){
                right = right.left;
            }
            minRight = right.val - root.val;
            minRight = Math.min(minRight,getMinimumDifference(root.right));
        }
        return Math.min(minLeft,minRight);

    }
}
