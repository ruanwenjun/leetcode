import java.util.Arrays;

/**
 * 合并k个排序链表
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-14 10:54
 */

public class Problem23 {
    /**
     * 思路：两两排序
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <= 0){
            return null;
        }
        ListNode leftNode;
        ListNode rightNode;
        if(lists.length > 2){
            ListNode[] leftList = Arrays.copyOfRange(lists,0,lists.length/2);
            ListNode[] rightList = Arrays.copyOfRange(lists, lists.length / 2, lists.length);
            leftNode = mergeKLists(leftList);
            rightNode = mergeKLists(rightList);
        }else if(lists.length == 2){
            leftNode = lists[0];
            rightNode = lists[1];
        }else {
            return lists[0];
        }
        if(leftNode == null){
            return rightNode;
        }
        if(rightNode == null){
            return leftNode;
        }

        if(leftNode.val > rightNode.val){
            ListNode tem = leftNode;
            leftNode = rightNode;
            rightNode = tem;
        }

        // 合并两个链表
        ListNode l = leftNode;
        ListNode pre = null;
        ListNode r ;
        while (l != null && rightNode != null){
            if(l.val <= rightNode.val){
                pre = l;
                l = l.next;
            }else {
                r = rightNode;
                rightNode = rightNode.next;
                r.next = pre.next;
                pre.next = r;
                pre = r;
            }
        }
        if(rightNode != null){
            pre.next = rightNode;
        }
        return leftNode;
    }

    public static void main(String[] args) {
        Problem23 p = new Problem23();
        ListNode f = new ListNode(1);
        f.next = new ListNode(4);
        f.next.next = new ListNode(5);
        ListNode s = new ListNode(1);
        s.next = new ListNode(3);
        s.next.next = new ListNode(4);
        ListNode t = new ListNode(2);
        t.next = new ListNode(6);
        ListNode[] list = new ListNode[]{null,null};
        p.mergeKLists(list);
    }
}
