import jdk.nashorn.api.tree.LiteralTree;
import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 把二叉搜索树转化为累加树
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 13:52
 */

public class Problem538 {
    /**
     * 将节点变为 自己加上所有大于它的节点之和
     * @param root
     * @return
     */
    public TreeNode convertBST(TreeNode root) {
        // 将树的节点值保存在一个集合中
        List<Integer> list = new ArrayList<>();
        query(root,list);
        // 修改每个节点
        root = convert(root,list);
        return root;


    }

    /**
     * 将节点转换
     * @param root
     * @param list
     * @return
     */
    public TreeNode convert(TreeNode root,List<Integer> list){
        // 使用递归的方法
        if(root != null){
            int count = 0;
            for (Integer o : list) {
                if(o>root.val){
                    count += o;
                }
            }
            root.val +=count;
            root.left = convert(root.left,list);
            root.right = convert(root.right,list);
            return root;
        }
        return null;
    }

    /**
     * 将二叉树的节点值保存在list中
     * @param root
     * @param list
     */
    public void query(TreeNode root,List list){
        if(root != null){
            list.add(root.val);
            query(root.left,list);
            query(root.right,list);
        }
    }


}
