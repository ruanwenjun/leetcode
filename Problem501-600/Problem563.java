/**
 * 二叉树的坡度
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 18:35
 */

public class Problem563 {
    /**
     * 计算坡度
     * 树的坡度为所有节点的坡度之和
     * 节点的坡度是指左子树的节点之和-右子树的节点之和的绝对值
     * @param root
     * @return
     */
    public int findTilt(TreeNode root) {
        // 采用递归的方法，计算当前的节点的坡度，然后 + 左孩子的坡度 + 右孩子的坡度
        if(root == null){
            return 0;
        }
        // 计算当前的坡度
        int tilt = Math.abs(count(root.left) - count(root.right));
        // 计算节点之和
        return tilt + findTilt(root.left ) + findTilt(root.right);
    }

    /**
     * 计算节点之和
     * @param node
     * @return
     */
    public int count(TreeNode node){
        int count = 0;
        if(node == null){
            return 0;
        }
        count +=node.val;
        return count + count(node.left) + count(node.right);
    }
}
