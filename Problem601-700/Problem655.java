import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.List;

/**
 * 输出二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-04 18:23
 */

public class Problem655 {
    /**
     * [["",  "",  "", "",  "", "", "", "1", "",  "",  "",  "",  "", "", ""]
     * ["",  "",  "", "2", "", "", "", "",  "",  "",  "",  "5", "", "", ""]
     * ["",  "3", "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]
     * ["4", "",  "", "",  "", "", "", "",  "",  "",  "",  "",  "", "", ""]]
     * 思路：利用递归做，首先得到二叉树的高度
     *
     * @param root
     * @return
     */
    public List<List<String>> printTree(TreeNode root) {
        int high = highTree(root);
        List<List<String>> result = new ArrayList<>();
        if (high == 0) {
            return result;
        }
        // 每一层的长2 high次方-1
        double pow = Math.pow(2, high);
        int length = (int) pow - 1;

        // 首先把每个都填充为""
        for (int i = 0; i < high; i++) {
            List<String> index = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                index.add(j, "");
            }
            result.add(index);
        }
        // 遍历二叉树
        searchTree(result,0,root,0,length - 1);
        return result;
    }

    /**
     * 获得树的高度
     *
     * @param node
     * @return
     */
    public int highTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(highTree(node.left), highTree(node.right));
    }

    /**
     * 遍历二叉树，填充
     *
     * @param list
     * @param high
     * @param node
     */
    public void searchTree(List<List<String>> list, int high, TreeNode node, int left, int right) {
        List<String> index = list.get(high);
        if (node == null) {
            return;
        }
        index.remove(left + (right - left)/ 2);
        index.add(left + (right - left) / 2, node.val + "");
        if (node.left != null) {
            searchTree(list, high + 1, node.left, left, left + (right - left)/ 2 - 1);
        }
        if (node.right != null) {
            searchTree(list, high + 1, node.right, left + (right - left) / 2 + 1, right);
        }
    }
}
