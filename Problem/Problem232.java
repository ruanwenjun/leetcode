import java.util.LinkedList;

/**
 * 用栈实现队列
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 13:22
 */

public class Problem232 {
    /**
     * 一个栈
     */
    LinkedList<Integer> stack;
    LinkedList<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public Problem232() {
        stack = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    /**
     * 进队列
     */
    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        // 将元素从栈顶移到栈尾
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }

        //
        stack.push(x);
        while (stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
    }

    /**
     * 出队列
     */
    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return stack.pop();
    }
    /**
     * 获得队头元素
     */
    /**
     * Get the front element.
     */
    public int peek() {
        return stack.peek();
    }
    /**
     * 判断是否为空
     */
    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}
