/**
 * 删除排序链表中的重复元素
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 13:29
 */

public class Problem83 {
    public ListNode deleteDuplicates(ListNode head) {
        // 遍历链表
        ListNode index = head;
        while (index != null && index.next != null){
            if(index.val == index.next.val){
                index.next = index.next.next;
            }
            index = index.next;
        }
        return head;
    }

}
