import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-03 18:41
 */

public class Problem22 {

    /**
     * 给出一个整数n
     * 求生成所有有效的括号数
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        // 采用的回溯法，思想是：如果当前左括号数小于右括号，则不满足，如果左括号数小于右括号数则不符合要求 (( )))
        List<String> list = new ArrayList<>();
        helper(list,"",n,n);
        return list;
    }
    public void helper(List<String> list,String res,int left,int right){
        if(left > right){
            return;
        }
        if(left == 0 && right == 0){
            list.add(res);
        }
        if(left > 0){
            helper(list,res+"(",left-1,right);
        }
        if(right > 0){
            helper(list,res+")",left,right - 1);
        }
    }

    public static void main(String[] args) {
        Problem22 p = new Problem22();
        List<String> list = p.generateParenthesis(3);
        System.out.println(list);
    }

}
