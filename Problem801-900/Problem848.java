import Aop.ProxyDemo;

/**
 * 字母移位
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 9:32
 */

public class Problem848 {
    /**
     * shifts[i] = k 是指将S中前i个字母移位k次
     * 思路：计算shifts中的次数，然后进行移位操作
     *
     * @param S
     * @param shifts
     * @return
     */
    public String shiftingLetters(String S, int[] shifts) {
        shifts[shifts.length - 1] = shifts[shifts.length - 1] % 26;
        for (int i = shifts.length - 2; i >= 0; i--) {
            shifts[i] = shifts[i]%26 +  shifts[i + 1]%26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            int index = shifts[i] % 26;
            if('z' - S.charAt(i) >= index){
                sb.append((char)(S.charAt(i) + index ));
            }else {
                sb.append((char)(S.charAt(i) + index - 26));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem848 p = new Problem848();
        int[] shifts = new int[]{505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        //"mkgfzkkuxownxvfvxasy"
        //[505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513]
        String abc = p.shiftingLetters("mkgfzkkuxownxvfvxasy", shifts);
        System.out.println(abc);
    }
}
