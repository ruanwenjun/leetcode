import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

/**
 * 字典中最长的单词
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-22 19:24
 */

public class Problem720 {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        for (String s : words) {
            set.add(s);
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String source, String target) {
                if (source.length() > target.length()) {
                    return 1;
                }
                if (source.length() == target.length()) {
                    for (int i = 0; i < source.length(); i++) {
                        if (source.charAt(i) < target.charAt(i)) {
                            return 1;
                        }
                        if(source.charAt(i) == target.charAt(i)){
                            continue;
                        }
                        return -1;
                    }
                }
                return -1;
            }
        });
        // 判断是否能够找到
        for (int i = words.length - 1; i >= 0; i--) {
            int j = words[i].length();
            for (;j>0;j--){
                if(set.contains(words[i].substring(0,j))){
                    continue;
                }else {
                    break;
                }
            }
            if(j == 0){
                return words[i];
            }
        }
        return "";

    }

    public static void main(String[] args) {
        Problem720 p = new Problem720();
        String[] S = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        String s = p.longestWord(S);
        System.out.println(s);
    }
}
