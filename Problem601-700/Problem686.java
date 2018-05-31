/**
 * 重复叠加字符串匹配
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 17:32
 */

public class Problem686 {
    /**
     * 寻找重复叠加A的最小次数，使得B是A叠加后的子串
     * 如果不存在则返回-1
     *
     * @param A
     * @param B
     * @return
     */
    public int repeatedStringMatch(String A, String B) {
        // 如果A的长度等于B并且A叠加一次后，B还不是A的子串那么返回-1
        // 记录叠加的次数
        int num = 1;
        StringBuilder sb = new StringBuilder(A);
        while (sb.length() < B.length()) {
            sb.append(A);
            num++;
        }
        String index = sb.toString();
        // 判断B是否是A的子串
        boolean subString = isSubString(index, B);
        if (subString) {
            return num;
        }
        // 叠加一次A
        index = index + A;
        num++;
        // 判断B是否是A的子串
        subString = isSubString(index, B);

        return subString ? num : -1;
    }

    /**
     * 判断B是否是A的子串
     *
     * @param A
     * @param B
     * @return
     */
    public boolean isSubString(String A, String B) {
        for (int i = 0; i <= A.length() - B.length(); i++) {
            boolean ok = true;
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i + j) != B.charAt(j)) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                return ok;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem686 p = new Problem686();
        int i = p.repeatedStringMatch("bb", "bbbbbbb");
        System.out.println(i);
    }
}
