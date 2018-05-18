import java.util.*;

/**
 * 找到BST中出现次数最多的节点值
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-17 11:39
 */

public class Problem501 {

    Map<Integer,Integer> map = new TreeMap<>();
    /**
     *
     * @param root
     * @return
     */
    public int[] findMode(TreeNode root) {
        prepare(root);
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for (Integer integer : map.keySet()) {
            Integer integer1 = map.get(integer);
            if(integer1>=index){
                index = integer1;
            }else {
                break;
            }
        }
        for (Integer integer : map.keySet()) {
            Integer integer1 = map.get(integer);
            if(integer1==index){
                index = integer1;
                list.add(integer);
            }
        }
        int [] a = new int[list.size()];
        for (int i =0;i< list.size();i++){
            a[i] = list.get(i);
        }
        return a;

    }

    public void prepare(TreeNode root){
        if(root != null){
            Integer integer = map.get(root.val);
            if(integer != null){
                map.put(root.val,integer+1);
            }else {
                map.put(root.val,1);
            }
            if(root.left!= null){
                prepare(root.left);
            }
            if(root.right!= null){
                prepare(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Problem501 p = new Problem501();
        TreeNode node = new TreeNode(1);
        node.left = null;
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(2);
        node.right = right;
        int[] mode = p.findMode(node);
        System.out.println(mode.length);
    }
}
