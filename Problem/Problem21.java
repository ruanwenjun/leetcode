/**
 * 合并两个有序链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 14:20
 */

public class Problem21 {
    /**
     * 将两个有序链表合并为一个新的有序链表
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null ){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        // 指向新链表的当前节点
        ListNode index;
        ListNode n;
        // 遍历两个链表
        if(l1.val <= l2.val){
            index = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            index = new ListNode(l2.val);
            l2 = l2.next;
        }
        ListNode result = index;
        // 遍历两个链表
        while (l1 != null && l2 != null){
            // 遍历两个链表
            if(l1.val <= l2.val){
                n = new ListNode(l1.val);
                index.next = n;
                l1 = l1.next;
            }else {
                n = new ListNode(l2.val);
                index.next = n;
                l2 = l2.next;
            }
            index = index.next;
        }
        if(l1 != null){
            index.next = l1;
        }
        if(l2 != null){
            index.next = l2;
        }
        return result;

    }
}
