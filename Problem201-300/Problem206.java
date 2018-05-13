/**
 * 反转链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 13:35
 */

public class Problem206 {
    /**
     * 反转一个链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        // 采用头插法
        if(head != null){
            ListNode pre = head;
            while (head.next!= null){
                ListNode node = new ListNode(head.next.val);
                node.next = pre;
                pre = node;
                head = head.next;
            }
            head = pre;
        }

        return head;
    }
}
