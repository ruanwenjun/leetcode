/**
 * 相同的树
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 18:05
 */

public class Problem100 {
    /**
     * 判断两棵树是否相同
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 采用递归的方法
        if(p == null && q == null){
            return true;
        }

       if(p == null || q == null || p.val != q.val){
           return false;
       }

       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


    }


}
