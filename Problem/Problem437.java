/**
 * 路径总和三
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 17:13
 */

public class Problem437 {
    // 路径总数
    public int count = 0;

    /**
     * 求树中路径总和为sum的路径数，不需要从根节点开始，也不需要到叶子节点结束
     *
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }
        count(root,sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum );
        return count;
    }

    /**
     * 计算从node节点开始总和为sum的路径
     * @param node
     * @param sum
     */
    public void count(TreeNode node,int sum){
        if(node != null){
            if(sum - node.val == 0){
                count++;
            }
            count(node.left,sum-node.val);
            count(node.right,sum-node.val);
        }
    }
}
