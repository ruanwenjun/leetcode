import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

/**
 * 单词模式
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-17 12:29
 */

public class Problem290 {
    /**
     * str中的单词是否和pattern匹配
     * @param pattern
     * @param str
     * @return
     */
    public boolean wordPattern(String pattern, String str) {
        String[] split = str.split(" ");
        if(pattern.length() != split.length){
            return false;
        }
        // 存储每个字母对应的单词
        Set<String> set = new HashSet<>();
        String [] index = new String[26];
        int num = 0;
        // 获取每个字母代表的单词
        for (int i = 0;i<pattern.length();i++){
            String s = index[pattern.charAt(i)-'a'];
            if(s==null){
                num++;
                index[pattern.charAt(i)-'a'] = split[i];
                set.add(split[i]);
            }else if(!s.equals(split[i])){
                return false;
            }
        }

        return num == set.size()?true:false;
    }

    public static void main(String[] args) {
        Problem290 p = new Problem290();
        boolean b = p.wordPattern("abba", "dog cat cat dog");
        System.out.println(b);
    }
}
