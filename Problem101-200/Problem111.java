/**
 * 二叉树的最小深度
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-21 22:18
 */

public class Problem111 {
    /**
     * 最小深度是根节点到最近叶子节点最短路径上的节点数
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        // 找出离他最近的叶子节点
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left != null && root.right != null){
            return 1 + Math.min(minDepth(root.left),minDepth(root.right));
        }
        if(root.left == null){
            return 1 + minDepth(root.right);
        }else {
            return 1 + minDepth(root.left);
        }
    }


}
