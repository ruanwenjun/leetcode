/**
 * 报数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 18:50
 */

public class Problem38 {
    /**
     * 输出当前数的报数序列
     *
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        if( n == 1){
            return "1";
        }
        // 获得前一个数的序列
        String pre = countAndSay(n - 1);
        String result = "";
        char[] chars = pre.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 如果它跟后面的不同，那么可以单独解析，如果跟后面的相同则需要组合解析
            // 记录当前相同的个数
            int count = 1;
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            result = result + count + chars[i];
        }
        return result;

    }
}
