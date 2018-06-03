/**
 * 二叉树剪支
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-02 13:26
 */

public class Problem814 {
    /**
     * 移除所有不包含1的子树
     * @param root
     * @return
     */
    public TreeNode pruneTree(TreeNode root) {
        // 采用后续遍历，如果左右都不包含1那么删除根
        // 如果左子树是空，右子树是空，且当前节点值不为1 那么就剪当前
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right== null && root.val == 0){
            root = null;
        }
        return root;
    }



}
