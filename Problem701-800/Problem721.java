/**
 * 两个字符串的最小ASCII删除和
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-12 18:30
 */

public class Problem721 {
    /**
     * @param s1
     * @param s2
     * @return
     */
    public int minimumDeleteSum(String s1, String s2) {
        int sum = 0;
        if (s1 == null && s2 == null || s1.equals("") || s2.equals("")) {
            return sum;
        }
        if (s1 == null) {
            for (char s : s2.toCharArray()) {
                sum += s;
            }
            return sum;
        }
        if (s2 == null) {
            for (char s : s1.toCharArray()) {
                sum += s;
            }
            return sum;
        }
        // minSum[i][j]表示s1(0,1,i)和s2(0,1,j)的最小删除
        int[][] minSum = new int[s1.length()+1][s2.length()+1];
        // 初始化假设都需要删
        for (int i = 1; i <= s1.length(); i ++){
            minSum[i][0] = minSum[i-1][0] + s1.charAt(i-1);
        }
        for (int j = 1; j <= s2.length(); j ++){
            minSum[0][j] = minSum[0][j-1] + s2.charAt(j-1);
        }
        for (int i = 1; i <= s1.length(); i ++){
            for (int j = 1 ; j <= s2.length(); j ++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    // 相等则不需要删除
                    minSum[i][j] = minSum[i-1][j-1];
                }else {
                    // 不相等，删除之和小的
                    minSum[i][j] = Math.min(minSum[i-1][j] + s1.charAt(i-1),minSum[i][j-1] + s2.charAt(j-1));
                }
            }
        }
        return minSum[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        Problem721 p = new Problem721();
        int i = p.minimumDeleteSum("delete", "leet");
        System.out.println(i);
    }
}
