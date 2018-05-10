/**
 * 二进制求和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 12:55
 */

public class Problem67 {
    /**
     * 求和
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        // 从右边开始算起
        // 记录当前算到第几位了
        StringBuilder sb = new StringBuilder();
        // 记录当前的进位情况
        char index = '0';
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            char c = a.charAt(a.length() - 1 - i);
            char c1 = b.charAt(b.length() - 1 - i);
            // 计算c c1 相加
            if (c == '0' && c1 == '0') {
                sb.append(index);
                index = '0';
            }
            if (c == '0' && c1 == '1') {
                if (index == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            if (c == '1' && c1 == '0') {
                if (index == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            if (c == '1' && c1 == '1') {
                sb.append(index);
                index = '1';
            }

        }
        int j = 1;
        while (b.length() < a.length() && j <=a.length()-b.length()) {
            char c = a.charAt(a.length() - j - b.length());
            if(c == '0'){
                sb.append(index);
                index = '0';
            }else if (index == '1' ){
                sb.append('0');
            }else {
                sb.append('1');
            }
            j++;
        }
        while (a.length() < b.length() && j <= b.length() - a.length()) {
            char c = b.charAt(b.length() - j - a.length());
            if(c == '0'){
                sb.append(index);
                index = '0';
            }else if (index == '1' ){
                sb.append('0');
            }else {
                sb.append('1');
            }
            j++;
        }
        if(index == '1'){
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Problem67 p = new Problem67();
        String s = p.addBinary("11","1");
        System.out.println(s);
    }
}
