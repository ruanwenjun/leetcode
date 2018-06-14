import com.sun.jdi.PathSearchingVirtualMachine;

import javax.sound.midi.MidiChannel;
import java.util.LinkedList;
import java.util.logging.Level;

/**
 * 最长有效括号
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 10:41
 */

public class Problem32 {

    /**
     * 计算最长有效括号
     * 思路：利用栈来做
     * 1 ：如果是左括号那么直接入栈
     * 2 ：如果是右括号，判断栈是否为空，如果为空，那么更新起始点为它的右边
     *                 如果栈不为空，那么出栈
     *                      如果出栈后为空，那么长度为此时的最大长度=当前索引-起始索引
     *                      如果出栈后不为空，那么那么长度为当前索引-栈顶索引
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        if(s == null){
            return 0;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int max = 0;
        int start = -1;
        for (int i = 0; i < s.length(); i ++){
            // 左括号直接入栈
            if(s.charAt(i) == '('){
                stack.push(i);
            }else {
                // 如果栈为空，更新起始长度
                if(stack.isEmpty()){
                    start = i;
                }else {
                    // 如果栈不为空，那么出栈
                    stack.pop();
                    //判断此时栈是否为空
                    if(stack.isEmpty()){
                        max = Math.max(max,i - start);
                    }else {
                        max = Math.max(max,i - stack.peek());
                    }
                }
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Problem32 p = new Problem32();
        int i = p.longestValidParentheses("()(()");
        System.out.println(i);
    }
}
