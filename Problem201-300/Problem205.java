/**
 * 同构字符串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-14 18:07
 */

public class Problem205 {
    /**
     * s和t具有同样的长度
     * 所有字符必须用另一字符替换，字符可以映射到自身
     * paper title可以
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        char[] cS = s.toCharArray();
        char[] cT = t.toCharArray();
        // 保存s中的字母对应在t中的映射
        char[] index = new char[256];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            index[cS[i]] = cT[i];

        }
        for (int i = 0; i < s.length(); i++) {
            sb.append(index[cS[i]]);

        }
        String t1 = sb.toString();
        index = new char[256];
        sb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            index[cT[i]] = cS[i];

        }
        for (int i = 0; i < t.length(); i++) {
            sb.append(index[cT[i]]);

        }
        String s1 = sb.toString();
        return t1.equals(t) && s1.equals(s);
    }

    public static void main(String[] args) {
        Problem205 p = new Problem205();
        boolean isomorphic = p.isIsomorphic("11", "11");
        System.out.println(isomorphic);
    }
}
