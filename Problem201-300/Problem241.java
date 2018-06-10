import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 为运算表达式设置优先级
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-09 12:29
 */

public class Problem241 {
    /**
     * 输出所有的可能结果
     * 运算符只包括*,+,-
     * 思路：采用分冶法将字符串按运算符分为左右两个字符串
     * @param input
     * @return
     */
    public List<Integer> diffWaysToCompute(String input) {
        ArrayList<Integer> list = new ArrayList<>();
        // 是否有符号的标志
        boolean hasChar = false;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '-' || input.charAt(i) == '+' || input.charAt(i) == '*'){
                hasChar = true;
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1, input.length()));
                for (int l : left){
                    for (int r : right){
                        if(input.charAt(i) == '+'){
                            list.add(l + r);
                        }else if (input.charAt(i) == '-'){
                            list.add(l - r);
                        }else {
                            list.add(l * r);
                        }
                    }
                }
            }
        }
        if(!hasChar){
            list.add(Integer.parseInt(input));
        }
        return list;
    }



    public static void main(String[] args) {
        Problem241 p = new Problem241();
        List<Integer> list = p.diffWaysToCompute("2*3-4*5");
        System.out.println(list);
    }
}
