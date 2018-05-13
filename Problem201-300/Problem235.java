/**
 * 二叉搜索树的最近公共祖先
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 16:58
 */

public class Problem235 {
    /**
     * 求节点p,q的最近公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 根节点肯定是他们的公共祖先，然后判断根节点的左孩子是不是他们的公共祖先，根节点的右孩子是不是他们的公共祖先
        // 如果是，那么递归左孩子或者右孩子
        // 当前节点肯定是他们的公共祖先
        boolean hasP = false;
        boolean hasQ = false;
        if(root.left != null){
            // 判断左孩子是不是
            hasP = has(root.left,p);
            hasQ = has(root.left,q);
            // 左孩子是
            if(hasP && hasQ){
                return lowestCommonAncestor(root.left,p,q);
            }
        }
        if(root.right != null){
            // 判断右孩子是不是
            hasP = has(root.right,p);
            hasQ = has(root.right,q);
            if(hasP && hasQ){
                return lowestCommonAncestor(root.right,p,q);
            }
        }
        return root;
    }

    /**
     * 判断当前树中是否存在p
     * @param root
     * @param p
     * @return
     */
    public boolean has(TreeNode root,TreeNode p){
        if(root == null){
            return false;
        }
        if(root == p){
            return true;
        }
        return has(root.left,p)||has(root.right,p);
    }
}
