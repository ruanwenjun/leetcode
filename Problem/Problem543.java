/**
 * 二叉树的直径
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-10 17:28
 */

public class Problem543 {

    /**
     * 返回二叉树中任意两节点路径长度的最大值
     * 路径长度是节点之间的边的数目
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        // 找到左边的路径长度的最大值
        // 找到右边的路径长度的最大值
        int index =  count(root.left) + count(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        return Math.max(index,Math.max(left,right));
    }

    /**
     * 找到当前节点的路径最大值
     * @param node
     * @return
     */
    public int count(TreeNode node){
        if(node == null){
            return 0;
        }
        return Math.max(count(node.left),count(node.right)) + 1 ;
    }
}
