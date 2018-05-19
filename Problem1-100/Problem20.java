import java.util.LinkedList;

/**
 * 有效的括号
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-18 12:47
 */

public class Problem20 {
    /**
     * 判断括号是否有效
     * ()[]{}
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        // 每次碰到左括号就入栈，碰到有括号就出栈
        LinkedList<Character> stack = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                Character pop = stack.pop();
                if (c == ')' && pop != '(' || c == ']' && pop != '[' || c == '}' && pop != '{') {
                    return false;
                }
            } else {
                return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
