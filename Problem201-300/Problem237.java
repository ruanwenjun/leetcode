/**
 * 删除链表中的节点
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 18:11
 */

public class Problem237 {
    /**
     * 删除链表中的节点
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
