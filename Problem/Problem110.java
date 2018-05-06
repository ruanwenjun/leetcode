import java.util.HashMap;

/**
 * 平衡二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 13:43
 */

public class Problem110 {
    // 用来保存树的高度
    HashMap<TreeNode,Integer> map = new HashMap<>();
    /**
     * 判断二叉树是否为平衡二叉树
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        // 采用递归的方法，判断当前节点的左右高度差绝对值是否不超过1
        if(root == null){
            return true;
        }
        int left = hight(root.left);
        int right = hight(root.right);
        if (Math.abs(left-right)<=1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    /**
     * 求当前树的高度
     * @param node
     * @return
     */
    public int hight(TreeNode node){
        if(node == null){
            return 0;
        }
        boolean b = map.containsKey(node);
        if(b){
            return map.get(node);
        }else {
            int i = 1 + Math.max(hight(node.left),hight(node.right));
            map.put(node,i);
            return i;
        }

    }
}
