/**
 * 翻转二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 19:02
 */

public class Problem266 {
    /**
     * 翻转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        // 使用递归的方式
        if(root != null){
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        return null;
    }
}


