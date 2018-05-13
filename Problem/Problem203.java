/**
 * 删除链表中的节点
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-12 13:46
 */

public class Problem203 {
    /**
     * 删除链表中给定值为val的所有节点
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        // 找到val的前一个节点
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode result = head;
        ListNode pre = head;
        if (head == null) {
            return head;
        }
        head = head.next;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            } else {
                pre = head;
            }
            head = head.next;
        }
        return result;
    }
}
