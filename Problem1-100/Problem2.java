/**
 * 两数相加
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-20 18:44
 */

public class Problem2 {
    /**
     * 将两个链表的值相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 进位
        int add = 0;
        // 输出的结果链表
        ListNode result = l1;
        // 指向l1的最后一个
        ListNode pre = null;
        while (l1 != null && l2 != null){
            int index = l1.val + l2.val + add;
            if(index>=10){
                add = 1;
                l1.val = index - 10;
            }else {
                add = 0;
                l1.val = index;
            }
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l2 != null) {
            l1 = l2;
            pre.next = l1;
        }
        while (l1 != null){
            int index = l1.val + add;
            if(index>=10){
                add = 1;
                l1.val = index - 10;
            }else {
                add = 0;
                l1.val = index;
            }
            pre = l1;
            l1 = l1.next;
        }
        if(add == 1){
            pre.next = new ListNode(1);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(0);
//        node.next = new ListNode(4);
//        node.next.next = new ListNode(3);
        ListNode node1 = new ListNode(7);
        node1.next = new ListNode(3);
//        node1.next.next = new ListNode(4);
        Problem2 p = new Problem2();
        p.addTwoNumbers(node,node1);
    }
}
