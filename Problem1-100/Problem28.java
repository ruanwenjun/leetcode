import javax.print.DocFlavor;
import javax.swing.table.TableRowSorter;

/**
 * 实现strStr
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-15 21:43
 */

public class Problem28 {
    /**
     * 在haystack中找出needle出现的第一个位置
     * 不存在则输出-1
     * 如果needle为“” 则输出0
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if (needle == null || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.equals("")) {
            return 0;
        }
        // 采用暴力方法，遍历字符串
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                // 匹配
                boolean isSame = true;
                int index = 0;
                for (int j = 1; j < needle.length() && j + i < haystack.length(); j++) {

                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        isSame = false;
                        break;
                    }else {
                        index++;
                    }
                }
                if (isSame && index == needle.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
