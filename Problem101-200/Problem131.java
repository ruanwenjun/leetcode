import java.util.ArrayList;
import java.util.List;

/**
 * 分割回文串
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-05 12:34
 */

public class Problem131 {
    List<List<String>> result = new ArrayList<>();

    /**
     * 将s分割成一些子串，保证每个子串都是回文串
     * 返回所有的分割方案
     *
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        if(s.equals("")){
           result.add(new ArrayList<>());
           return result;
        }
        helper(new ArrayList<>(),s);
        return result;
    }

    /**
     * 回溯，将s分解成回文子串
     *
     * @param list 保存已经分解了的回文子串
     * @param s 还未分解
     */
    public void helper(List<String> list, String s) {
        if (s == null || s.equals("")) {
            return;
        }
        // 判断s是否为回文串
        List<String> index = new ArrayList<>(list);
        if (isHuiWen(s)) {
            index.add(s);
            result.add(index);
        }
        for (int i = 0; i < s.length(); i++) {
            index = new ArrayList<>(list);
            // 如果当前子串是回文串
            if(isHuiWen(s.substring(0,i + 1))){
                index.add(s.substring(0,i + 1));
                helper(index,s.substring(i + 1,s.length()));
            }
        }
    }

    /**
     * 判断s是否为回文串
     *
     * @param s
     * @return
     */
    public boolean isHuiWen(String s) {
        if (s == null) {
            return false;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem131 p = new Problem131();
        List<List<String>> aab = p.partition("bb");
        System.out.println(aab);
    }
}