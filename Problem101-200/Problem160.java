import java.util.List;

/**
 * 相交链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-22 12:31
 */

public class Problem160 {
    /**
     * 返回两个单链表相交的起始节点，如果没有则返回NULL
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 遍历两个链表，假设是右对齐
        int headALen = 0;
        int headBLen = 0;
        ListNode index = headA;
        while (index != null) {
            headALen++;
            index = index.next;
        }
        index = headB;
        while (index != null) {
            headBLen++;
            index = index.next;
        }
        ListNode preA = headA;
        ListNode preB = headB;
        while (headALen > headBLen) {
            preA = preA.next;
            headALen--;
        }
        while (headALen < headBLen) {
            preB = preB.next;
            headBLen--;
        }
        while (preA != null) {
            if (preA == preB) {
                break;
            }
            preA = preA.next;
            preB = preB.next;
        }

        return preA;
    }


}

