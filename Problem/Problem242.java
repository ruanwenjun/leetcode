/**
 * 有效的字母异位词
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 13:56
 */

public class Problem242 {
    /**
     * 判断t是否为s的字母异位词
     * 即字母调整位置
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // 统计s t 中每个字母出现的次数
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();

        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : ss){
            countS[c-'a']++;
        }
        for (char c : ts){
            countT[c-'a']++;
        }
        for (int i = 0;i<26;i++){
            if(countS[i] != countT[i]){
                return false;
            }
        }
        return true;
    }
}
