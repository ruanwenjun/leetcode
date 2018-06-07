/**
 * 有序链表转换为二叉搜索树
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-06 17:00
 */

public class Problem109 {
    /**
     * 将有序链表转换为平衡的二叉搜索树
     *
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        // 使用递归构造的方式
        if (head == null) {
            return null;
        }
        // 记录链表的长度
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        ListNode pre = null;
        node = head;
        // 根的值就是链表中间的值
        for (int i = 0; i < size / 2 ; i++) {
            pre = node;
            node = node.next;
        }

        TreeNode root = new TreeNode(node.val);
        if(pre != null){
            pre.next = null;
            root.left = sortedListToBST(head);
        }
        root.right = sortedListToBST(node.next);

        return root;
    }

}
