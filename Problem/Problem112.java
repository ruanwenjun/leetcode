import java.util.ArrayList;
import java.util.List;

/**
 * 路径总和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 13:54
 */

public class Problem112 {
    List<Integer> list = new ArrayList<>();
    /**
     * 判断二叉树中是否存在从根节点到叶子节点的路径等于 sum
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum)  {
        // 找出所有二叉树的路径
        serchTree(root,0);
        if(list.contains(sum)){
            return true;
        }
        return false;

    }

    /**
     * 统计所有二叉树的路径
     * @param root
     */
    public void serchTree(TreeNode root,int count){
        if(root != null){
            count +=root.val;
            if(root.left == null && root.right == null){
                // 是叶子节点
                list.add(count);
                return;
            }
            int c = count;
            if(root.left != null){
                serchTree(root.left,c);
            }
            if(root.right != null){
                serchTree(root.right,c);
            }


        }
    }

}
