/**
 * 对称二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 17:00
 */

public class Problem101 {

//    /**
//     * 判断是不是镜像二叉树
//     * 用递归、迭代两种方法做
//     * @param root
//     * @return
//     */
//    public boolean isSymmetric(TreeNode root) {
//        // 递归判断,左子树的左孩子等于右子树的右孩子，左子树的右孩子等于右子树的左孩子
//        if(root != null){
//            return isSame(root.left,root.right);
//        }
//        return true;
//    }
//
//    /**
//     * 判断是不是镜像相等
//     * @param left
//     * @param right
//     * @return
//     */
//    public boolean isSame(TreeNode left,TreeNode right){
//        if(left == null && right == null){
//            return true;
//        }
//        if(left != null && right != null){
//            if(left.val != right.val){
//                return false;
//            }
//            return isSame(left.left,right.right)&&isSame(left.right,right.left);
//        }
//        return false;
//    }

    /**
     * 尝试迭代
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        // 使用栈来保存树的节点
        // 每次判断完之后将树的孩子节点加入栈中即可，注意添加孩子节点的顺序，然后每次循环的时候从栈中取出两个节点即可

        return true;
    }

}
