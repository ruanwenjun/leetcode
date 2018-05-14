/**
 * 另一个树的子树
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-13 18:14
 */

public class Problem572 {
    /**
     * s , t 非空
     * 判断t是不是s的子树
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return isSame(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    /**
     * 判断两个树是否相等
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s != null && t != null) {
            if (s.val == t.val) {
                // 递归判断左右子树是否相等
                return isSame(s.left, t.left) && isSame(s.right, t.right);
            }
        }
        return false;

    }
}
