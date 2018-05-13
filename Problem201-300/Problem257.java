import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 20:41
 */

public class Problem257 {
    /**
     * 返回二叉树的所有从根节点到叶子节点的路径
     * 这种形式 ： "1->2->5"
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return  new ArrayList<>();
        }
        //采用递归的方式
        List<String> list = new ArrayList<>();
        //如果当前节点有孩子
        if(root.right != null || root.left != null){
            //如果当前节点有孩子节点，那么递归
            List<String> leftList = null;
            List<String> rightList = null;
            if(root.left != null){
                leftList = binaryTreePaths(root.left);
                for (String s : leftList) {
                    list.add(root.val+"->"+s);
                }
            }
            if(root.right != null){
                rightList = binaryTreePaths(root.right);
                for (String s : rightList) {
                    list.add(root.val+"->"+s);
                }
            }
            // 将左右孩子的都加进来
        }else{
            //当前节点没有孩子
            list.add(root.val + "");
        }
        return list;
    }
}
