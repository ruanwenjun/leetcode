/**
 * 根据二叉树创建字符串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 18:15
 */

public class Problem606 {
    /**
     * 将二叉树转换为由括号和整数组成的字符串
     * 采用前序遍历的方式
     * @param t
     * @return
     */
    public String tree2str(TreeNode t) {
        //采用递归的方式
        StringBuilder sb = new StringBuilder();
        // 任何节点开始前先添加一个"("
        if(t!=null){
            sb.append(t.val);
            // 如果左孩子为空，右孩子不为空
            if(t.left==null && t.right != null){
                sb.append("()");
                // 添加右孩子
                sb.append(tree2str(t.right));
            }else if(t.left != null){
            // 左孩子右孩子都为空则不需要递归
                sb.append("(");
                sb.append(tree2str(t.left));
                // 添加一个右括号
                sb.append(")");
            }else if(t.left != null&&t.right != null){
                sb.append("(");
                sb.append(tree2str(t.right));
                // 添加一个右括号
                sb.append(")");
            }
        }

        return sb.toString();
    }

}
