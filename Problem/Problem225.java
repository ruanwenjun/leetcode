import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用队列实现栈
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 16:08
 */

public class Problem225 {
    Deque<Integer> deque ;

    /**
     * 栈的初始化操作
     */
    /** Initialize your data structure here. */
    public Problem225() {
        deque = new ArrayDeque<>();
    }
    /**
     * 入栈
     */
    /** Push element x onto stack. */
    public void push(int x) {
        deque.addFirst(x);
    }
    /**
     * 出栈
     */
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque.pop();
    }
    /**
     *
     * 获得栈顶元素
     */
    /** Get the top element. */
    public int top() {
       return deque.getFirst();
    }
    /**
     * 判断栈是否为空
     */
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque.isEmpty();
    }
}
