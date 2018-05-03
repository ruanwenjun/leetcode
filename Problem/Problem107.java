import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的层次遍历二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 17:04
 */

public class Problem107 {
    /**
     * 返回二叉树的自底向上的层次遍历
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 使用一个队列来保存节点
        ArrayDeque<TreeNode> nodeQueue = new ArrayDeque<>();
        // 保存当前节点有几个孩子
        int count = 0;
        TreeNode pop = null;
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(root != null){
            nodeQueue.add(root);
            count ++;
        }
        // 队列不为空的时候循环
        while (!nodeQueue.isEmpty()){
            int childNum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i< count; i++){
                pop = nodeQueue.pop();
                list.add(pop.val);
                // 将孩子入队
                if(pop.left != null){
                    nodeQueue.add(pop.left);
                    childNum ++;
                }
                if(pop.right != null){
                    nodeQueue.add(pop.right);
                    childNum ++;
                }
            }
            count = childNum;
            result.addFirst(list);
        }
        return result;
    }
}
