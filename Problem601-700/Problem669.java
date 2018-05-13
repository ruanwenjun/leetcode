/**
 * 修剪二叉搜索树
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 14:39
 */

public class Problem669 {
    /**
     * 返回新的二叉搜索树，使得节点值在L.R之间
     *
     * @param root
     * @param L
     * @param R
     * @return
     */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        while(root != null &&(root.val < L||root.val >R)){
            //让每一个节点都落在 L R 之间
            while (root != null && root.val < L ) {
                root = root.right;
            }
            while (root != null && root.val > R) {
                root = root.left;
            }
        }
        if (root == null ) {
            return null;
        }

        /*//根节点在 L,R之间
        if (root.left != null && root.left.val < L) {
            root.left.left = null;
        }

        if (root.right != null && root.right.val > R) {
            root.right.right = null;
        }*/
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);

        return root;

    }
}
