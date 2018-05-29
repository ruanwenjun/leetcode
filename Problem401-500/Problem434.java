/**
 * 字符串中单词个数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-28 21:33
 */

public class Problem434 {
    public int countSegments(String s) {
        // 遍历一遍字符串
        int num = 0;
        int i = 0;
        if (s == null) {
            return 0;
        }
        // 找到第一个不是空格的字符
        while (i < s.length() && s.charAt(i) != ' ') {
            i++;
        }
        while(i<s.length()) {
            // 找到第一个不是空格的字符
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }

            num ++;
            // 找到单词尾
            while (i<s.length() && s.charAt(i) == ' '){
                i++;
            }
        }
        return num;
    }
}
