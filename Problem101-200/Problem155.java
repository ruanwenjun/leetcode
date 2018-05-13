/**
 * 最小栈
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 12:24
 */

public class Problem155 {
    /**
     * 设计一个栈
     */
    // 栈顶
    Node top;
    // 栈底
    Node bottom;
    private class Node{
        // 当前节点值
        public int val;
        // 指向下一节点
        public Node next;
        //指向上一个节点
        public Node pre;
        public Node(int val){
            this.val = val;
        }

    }
    /** initialize your data structure here. */
    public Problem155() {
        // 初始化栈顶和栈底都指向空
        top = bottom = null;
    }

    /**
     * 进栈
     * @param x
     */
    public void push(int x) {
        Node n = new Node(x);
        // 栈为空
        if(top == null){
            top = bottom = n;
        }else{
            // 栈不为空
            top.next = n;
            n.pre = top;
            top = n;
        }
    }

    /**
     * 出栈
     */
    public void pop() {
        // 栈为空
        if(top.pre == null){
            top = bottom = null;
        }else {
            // 栈不为空
            top = top.pre;
            top.next = null;
        }
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public int top() {
        if(top != null){
            return top.val;
        }else {
            // 栈为空
            throw new NullPointerException();
        }
    }

    /**
     * 获取最小的元素
     * @return
     */
    public int getMin() {
        if(top == null){
            throw new NullPointerException();
        }
        int min = Integer.MAX_VALUE;
        Node index = top;
        while (index != null){
            min = Integer.min(min,index.val);
            index = index.pre;
        }
        return min;
    }
}
