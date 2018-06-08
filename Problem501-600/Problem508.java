import java.util.*;

/**
 * 频率最高的子树和
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-07 22:14
 */

public class Problem508 {
    Map<Integer, Integer> map = new HashMap<>();

    /**
     * 输出频率最高的子树和
     *
     * @param root
     * @return
     */
    public int[] findFrequentTreeSum(TreeNode root) {
        // 思路：采用后序遍历的方式求出每个节点的和
        if (root == null) {
            return new int[0];
        }
        count(root);
        int maxNum = 0; for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxNum){
                maxNum = entry.getValue();
            }
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == maxNum){
                list.add(entry.getKey());
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i ++){
            result[i] = list.get(i);
        }
        return result;

    }

    public void count(TreeNode node) {
        if (node == null) {
            return;
        }
        count(node.left);
        count(node.right);
        if (node.left != null) {
            node.val += node.left.val;
        }
        if (node.right != null) {
            node.val += node.right.val;
        }
        Integer integer = map.get(node.val);
        if (integer == null) {
            map.put(node.val, 1);
        } else {
            map.put(node.val, integer + 1);
        }
    }
}
