import java.util.ArrayList;
import java.util.List;

/**
 * 找到字符串中所有字母异位词
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 13:55
 */

public class Problem438 {
    /**
     * 采用暴力+异或运算符
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] index = new int[26];
        boolean is = true;
        for (int i = 0; i <= s.length() - p.length(); i++) {
            is = true;
            for (int j = 0;j<26;j++){
                index[j] = 0;
            }
            for (int j = 0; j < p.length(); j++) {
                index[p.charAt(j)-'a']++;
                index[s.charAt(i+j)-'a']--;
            }
            for (int j =0;j<26;j++){
                if(index[j] != 0){
                    is = false;
                }
            }
            if(is){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Problem438 p = new Problem438();
        List<Integer> anagrams = p.findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
