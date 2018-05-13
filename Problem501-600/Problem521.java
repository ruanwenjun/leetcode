/**
 * 最长的特殊序列一
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 22:30
 */

public class Problem521 {
    /**
     * 输出最长的特殊子序列，不存在则输出0
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {

        if(!a.equals(b)){
            return a.length()>b.length()?a.length():b.length();
        }
        // 如果两个字符串相等，那么返回-1
        return -1;



    }
}
