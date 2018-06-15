import java.util.ArrayList;
import java.util.List;

/**
 * 不同的二叉搜索树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-14 20:36
 */

public class Problem95 {
    /**
     * 求由1-n组成的二叉搜索数的个数
     * 思路：得出由 i +1 - n 的数的个数，然后把i插入
     *
     * @param n
     * @return
     */
    public List<TreeNode> generateTrees(int n) {
        if(n < 1){
            return new ArrayList<TreeNode>();
        }
        return generateTrees(1,n);
    }

    /**
     * 生成由start-end的树
     * @param start
     * @param end
     * @return
     */
    public List<TreeNode> generateTrees(int start,int end){
        List<TreeNode> nodeList = new ArrayList<>();
        if(start == end){
            TreeNode node = new TreeNode(start);
            nodeList.add(node);
            return nodeList;
        }
        // 获取子问题的解
        List<TreeNode> treeNodes = generateTrees(start + 1, end);
        // 将start插入到treeNodes的每一棵树
        for (TreeNode n : treeNodes){
            // 首先加到父节点
            TreeNode node = new TreeNode(start);
            node.right = n;
            nodeList.add(node);
            // 加到每一个左边

            TreeNode index = copyTreeNode(n);
            TreeNode pre = index;
            while (pre.left != null){
                node = new TreeNode(start);
                node.right = pre.left;
                pre.left = node;
                // copy一个n
                nodeList.add(copyTreeNode(index));
                //
                pre.left = node.right;
                pre = pre.left;
            }
            pre.left = new TreeNode(start);
            nodeList.add(index);
        }
        return nodeList;
    }

    /**
     * 复制一棵树
     * @param root
     * @return
     */
    public TreeNode copyTreeNode(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        node.left = copyTreeNode(root.left);
        node.right = copyTreeNode(root.right);
        return node;
    }

    public static void main(String[] args) {
        Problem95 p = new Problem95();
        p.generateTrees(3);
    }

}
