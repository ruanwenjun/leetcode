import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 二叉树中的第二小的节点
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 17:18
 */

public class Problem671 {
    List<Integer> list = new ArrayList<>();
    /**
     * 输出最小堆中第二小的值
     *
     * @param root
     * @return
     */
    public int findSecondMinimumValue(TreeNode root) {
        put(root,root.val);
        list.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1<o2?1:-1;
            }
        });
        if(list.size()>=1){
            return list.get(0);
        }
        return -1;

    }

    /**
     * 找到所有比k大的数
     *
     * @param root
     */
    public void put(TreeNode root,int k) {
        if (root == null) {
            return;
        }
        if(root.val>k){
            list.add(root.val);
            return;
        }
        put(root.left,k);
        put(root.right,k);
    }
}
