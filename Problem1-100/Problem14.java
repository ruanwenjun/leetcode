/**
 * 最长公共前缀
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 11:41
 */

public class Problem14 {
    /**
     * 获得最长公共前缀
     * 如果不存在则返回空串
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        // 从第一个字母开始比对
        String index = strs[0];
        for (int j = 0; j < index.length(); j++) {
            boolean add = true;
            boolean finish = false;
            for (int i = 0; i < strs.length; i++) {
                if (j < strs[i].length()) {
                    if (strs[i].charAt(j) == index.charAt(j)) {
                        continue;
                    }
                    add = false;
                    finish = true;
                }else {
                    add = false;
                    finish = true;
                }
            }
            if (add) {
                sb.append(index.charAt(j));
            }
            if (finish) {
                break;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Problem14 p = new Problem14();
        String[] a = new String[]{"aca","cba"};
        String s = p.longestCommonPrefix(a);
        System.out.println(s);
    }
}
