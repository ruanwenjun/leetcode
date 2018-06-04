import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的中序遍历
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-03 13:11
 */

public class Problem94 {
    /**
     * 使用迭代方法实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // 栈
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (!stack.isEmpty()) {
            // 出栈，遍历当前节点，然后如果他有右孩子，则右孩子入栈
            TreeNode pop = stack.pop();
            list.add(pop.val);
            if(pop.right != null){
                TreeNode node = pop.right;
                while (node != null){
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return list;
    }
}
