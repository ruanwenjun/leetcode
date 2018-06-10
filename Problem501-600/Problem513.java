import java.util.LinkedList;

/**
 * 找树左下角的值
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-09 17:36
 */

public class Problem513 {
    /**
     * 找到树最后一层最左边的值
     * 可以假定root不为空
     *
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        // 思路：采用层次遍历的方法
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // 记录每一层最左边的值
        int first = root.val;
        // 记录当前层有多少个节点
        int nodeNum = 1;
        while (!queue.isEmpty()) {
            int nextNodeNum = 0;
            first = queue.peek().val;
            for (int i = 0; i < nodeNum; i++) {
                TreeNode poll = queue.poll();
                if(poll.left != null){
                    queue.add(poll.left);
                    nextNodeNum ++;
                }
                if(poll.right != null){
                    queue.add(poll.right);
                    nextNodeNum ++;
                }
            }
            nodeNum = nextNodeNum;
        }
        return first;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.right = new TreeNode(1);
        Problem513 p = new Problem513();
        int bottomLeftValue = p.findBottomLeftValue(node);
        System.out.println(bottomLeftValue);
    }
}
