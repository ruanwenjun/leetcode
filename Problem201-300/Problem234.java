
/**
 * 回文链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-23 14:04
 */

public class Problem234 {
    /**
     * 判断一个链表是否为回文链表
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // 首先找到链表的长度
        int len = 0;
        ListNode index = head;
        while (index != null) {
            len++;
            index = index.next;
        }
        boolean tem = len % 2 == 0;
        len = len / 2;
        index = head;
        for (int i = 0; i < len; i++) {
            index = index.next;
        }
        if(!tem ){
            index = index.next;
        }
        // 将链表index转置
        ListNode pre = index;
        ListNode last = index;
        index = index.next;
        while (index != null){
            last.next = index.next;
            index.next = pre;
            pre = index;
            index = last.next;
        }
        while (pre != null){
            if(pre.val == head.val){
                pre = pre.next;
                head = head.next;
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Problem234 p = new Problem234();
        ListNode n = new ListNode(1);
//        n.next = new ListNode(1);
        boolean palindrome = p.isPalindrome(n);
        System.out.println(palindrome);
    }
}
