import java.util.Arrays;

/**
 * 从中序与后序序列构造二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-07 18:15
 */

public class Problem106 {
    /**
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // 思路：采用递归的方法，后序遍历最后一个就是根，中序中左边的是左子树，右边的是右子树
        if(postorder.length <=0 || inorder.length <= 0){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int mid = 0;
        for (int i = 0; i < inorder.length; i ++){
            if(inorder[i] == postorder[postorder.length - 1]){
                mid = i;
                break;
            }
        }
        int[] inorderLeft = Arrays.copyOfRange(inorder, 0, mid);
        int[] inorderRight = Arrays.copyOfRange(inorder,mid + 1,inorder.length);
        int[] postorderLeft = Arrays.copyOfRange(postorder, 0, mid);
        int[] postorderRight = Arrays.copyOfRange(postorder, mid, postorder.length - 1);
        root.left = buildTree(inorderLeft,postorderLeft);
        root.right = buildTree(inorderRight,postorderRight);
        return root;
    }

    public static void main(String[] args) {
        Problem106 p = new Problem106();
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        p.buildTree(inorder,postorder);
    }
}
