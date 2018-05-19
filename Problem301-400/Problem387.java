/**
 * 字符串中第一个唯一字符
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-18 12:40
 */

public class Problem387 {
    /**
     * 找出第一个不重复的唯一字符，并返回索引，如果不存在则返回-1
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        // 遍历字符串统计每个字母的出现次数
        int [] count = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars){
            count[c - 'a'] = count[c - 'a'] + 1;
        }
        for (int i = 0;i<chars.length;i++){
            if(count[chars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
