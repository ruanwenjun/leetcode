/**
 * 左叶子之和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 13:02
 */

public class Problem404 {
    /**
     * 计算给定二叉树的所有左叶子之和
     * @param root
     * @return
     */
    public int sumOfLeftLeaves(TreeNode root) {
        // 采用递归的方法做
        if(root == null){
            return 0;
        }
        // 左孩子是叶子
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
