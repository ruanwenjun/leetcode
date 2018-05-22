/**
 * 验证回文串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-21 22:28
 */

public class Problem125 {
    /**
     * 忽略大小写，只考虑数字和字母
     *空串是有效的，只有标点是无效的
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        for (int i = 0; i < j; i++,j--) {
            while (j >= i) {
                boolean is = (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') ||
                        (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')||(s.charAt(j) >= '0' && s.charAt(j) <= '9');
                if (is) {
                    break;
                }
                j--;
            }
            while (i <= j) {
                boolean is = (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                        (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')||(s.charAt(i) >= '0' && s.charAt(i) <= '9');
                if (is) {
                    break;
                }
                i++;
            }
            if(i >= j){
                break;
            }
            if(i<=j&&Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem125 p = new Problem125();
        boolean palindrome = p.isPalindrome("0p");
        System.out.println(palindrome);
    }
}
