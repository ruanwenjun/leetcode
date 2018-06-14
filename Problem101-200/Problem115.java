import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * 不同的子序列
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 16:55
 */

public class Problem115 {
    int[][] num;

    /**
     * 如果当前的字母跟t的开头不相等，那么直接++
     * 分两种情况讨论
     *
     * @param s
     * @param t
     * @return
     */
    public int numDistinct(String s, String t) {

        if(s == null || t == null || s.length() ==0 || t.length() == 0){
            return 0;
        }
        // 记录从s的第i个字母开始，与t的第j个字母开始，剩余的匹配子序列个数
        num = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                num[i][j] = -1;
            }
        }
        int count = count(s, t, 0, 0);
        return count;
    }

    public int count(String s, String t, int i, int j) {
        if (j >= t.length()) {
            return 1;
        }else if(i >= s.length()){
            return 0;
        }
        if (num[i][j] != -1) {
            return num[i][j];
        }
        int index = i;
        while (i < s.length() && s.charAt(i) != t.charAt(j)) {
            i++;
        }
        if (i < s.length()) {
            num[index][j] = count(s, t, i + 1, j) + count(s, t, i + 1, j + 1);
            return num[index][j];
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Problem115 p = new Problem115();
        int i = p.numDistinct("aacaacca", "ca");
        System.out.println(i);
    }
}
