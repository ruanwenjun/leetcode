import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 二叉搜索树节点最小距离
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 18:07
 */

public class Problem783 {
    List<Integer> list = new ArrayList<>();
    /**
     * 返回二叉搜索树中两节点差的最小值
     * @param root
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        searchTree(root);
        // 求list中的差值最小
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1<o2?-1:1;
            }
        });
        int min = Integer.MAX_VALUE;
        if(list.size() ==2){
            return list.get(1) - list.get(0);
        }
        for (int i =1;i<list.size() -1;i++){
            // 每个数的差的最小值肯定在左右两边
            int left = list.get(i) - list.get(i - 1);
            int right = list.get(i+1) - list.get(i);
            min = Math.min(min,Math.min(left,right));
        }
        return min;
    }

    /**
     * 遍历二叉树，并将节点值放入list
     * @param node
     */
    public void searchTree(TreeNode node){
        if(node != null){
            list.add(node.val);
        }
        if(node.left != null){
            searchTree(node.left);
        }
        if(node.right != null){
            searchTree(node.right);
        }
    }

}
