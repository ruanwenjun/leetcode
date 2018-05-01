import java.util.*;

/**
 * 二叉树的层平均值
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 12:17
 */

public class Problem637 {
    /**
     * 返回非空二叉树层平均值的数组
     *
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        // 采用层次遍历的方法，遍历每一层然后计算每一层的平均值
        ArrayDeque<TreeNode> queue = new ArrayDeque();
        // 队列中保存节点
        queue.add(root);
        // 标识当前层有多少个节点
        int parent = 1;
        //当队列不为空的时候循环
        while (!queue.isEmpty()) {
            // 标识下一层有多少个节点
            int child = 0;
            double count = 0;
            // 统计当前层的节点
            for (int i = 0; i < parent; i++) {
                TreeNode pop = queue.pop();
                count += pop.val;
                // 将孩子入队
                if (pop.left != null) {
                    queue.add(pop.left);
                    child++;
                }
                if (pop.right != null) {
                    queue.add(pop.right);
                    child++;
                }
            }

            list.add(count / parent);
            parent = child;
        }
        return list;
    }
}
