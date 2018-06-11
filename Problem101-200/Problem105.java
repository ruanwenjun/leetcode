import javax.print.attribute.standard.OrientationRequested;

/**
 * 从前序与中序序列构造二叉树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 21:27
 */

public class Problem105 {
    /**
     * 思路：前序序列第一个是根，然后找到中序中的根，递归进行
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    /**
     * 根据前序中序，构造二叉树
     *
     * @param preorder
     * @param inorder
     * @param prdStart
     * @param preEnd
     * @param inStart
     * @param inEnd
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder, int prdStart, int preEnd, int inStart, int inEnd) {
        if (prdStart > preEnd || inStart > inEnd) {
            return null;
        }
        int root = preorder[prdStart];
        int mid = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root) {
                mid = i;
                break;
            }
        }
        TreeNode node = new TreeNode(root);
        node.left = buildTree(preorder, inorder, prdStart + 1, prdStart + mid - inStart, inStart, mid - 1);
        node.right = buildTree(preorder, inorder, prdStart + 1 + mid - inStart, preEnd, mid + 1, inEnd);
        return node;
    }

    public static void main(String[] args) {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        Problem105 p = new Problem105();
        p.buildTree(preorder,inorder);
    }
}
