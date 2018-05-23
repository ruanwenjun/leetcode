import java.util.HashSet;
import java.util.Set;

/**
 * 环形链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-22 12:53
 */

public class Problem141 {
    /**
     * 判断链表中是否有环
     * 能否不使用额外的空间
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
       Set<ListNode> set = new HashSet<>();
       if(head == null) {
           return false;
       }
       set.add(head);
       head = head.next;
       while (head != null){
           if(set.contains(head)){
               return true;
           }
           set.add(head);
           head = head.next;
       }
       return false;
    }
}
