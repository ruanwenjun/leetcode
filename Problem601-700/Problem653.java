/**
 * 两数之和四-输入BST
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 13:11
 */

public class Problem653 {
    /**
     * 判断二叉搜索树中是否存在两个元素之和等于K
     * @param root
     * @param k
     * @return
     */
    public boolean findTarget(TreeNode root, int k) {
       return find(root,root,k);
    }

    /**
     * 判断树中是否存在一个节点的值+node的值等于k
     * @param root
     * @param node
     * @return
     */
    public boolean find(TreeNode root,TreeNode node,int k){
        if(node == null){
            return false;
        }
        int r = k - node.val;
        boolean result ;
        // 判断剩下的值
        if(r>root.val){
            result =  has(root.right,r,node);
        }else {
            result = has(root.left,r,node);
        }
        return result||find(root,node.left,k)||find(root,node.right,k);
    }

    /**
     * 判断二叉搜索树中是否存在节点值为k的节点
     * @param node
     * @param k
     * @return
     */
    public boolean has(TreeNode node,int k,TreeNode p){
        if(node == null){
            return false;
        }
        if(node.val == k && node != p){
            return true;
        }
        if(node.val<k){
            return has(node.right,k,p);
        }else {
            return has(node.left,k,p);
        }
    }
}
