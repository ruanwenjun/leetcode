import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 最常见的单词
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 18:16
 */

public class Problem819 {
    /**
     * 输出出现次数最多且不在禁用数组的单词
     * 标点符号!?',;.
     * 不区分大小写
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        // 先遍历一遍统计单词数量
        Map<String, Integer> map = new HashMap<>();
        char[] chars = paragraph.toCharArray();
        for (int i = 0; i < paragraph.length(); i++) {
            if (Character.isLowerCase(chars[i]) || Character.isUpperCase(chars[i])) {
                StringBuilder sb = new StringBuilder();
                // 是否是字母的标志
                while (i < paragraph.length()&&((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))) {
                    sb.append(chars[i]);
                    i++;
                }
                String a = sb.toString().toLowerCase();
                // 判断a是否在禁用数组里
                Integer num = map.get(a);
                if (num != null) {
                    map.put(a, num + 1);
                } else {
                    map.put(a, 1);
                }
            }
        }
        int max = 0;
        String result = "";
        for (String s : map.keySet()) {
            // 判断是否在禁用数组的标志
            boolean is = false;
            for (int i = 0;i<banned.length;i++){
                if(banned[i].equals(s)){
                    is = true;
                    break;
                }
            }
            if(!is){
                Integer integer = map.get(s);
                if(integer > max){
                    max = integer;
                    result = s;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem819 p = new Problem819();
        String[] a = new String[]{};
        String s = p.mostCommonWord("bob", a);
        System.out.println(s);
    }
}
