/**
 * 验证回文字符串二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 12:56
 */

public class Problem680 {
    /**
     * 最多删除一个字符，判断能否成为回文串
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
       // 从前 后分别遍历，如果相等则跳过，如果不相等则分别判断删除该字符后能否构成回文
        if(s == null){
            return false;
        }
        int len = s.length();
        boolean result = true;
        boolean resultL = true;
        boolean resultR = true;
        for (int i = 0,j = len -1;i<=j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                result = false;
                // 判断删除i或j后能否构成回文
                String index = s.substring(i,j);
                for (int n = 0;n<index.length();n++){
                    if(index.charAt(n) != index.charAt(index.length() - 1 - n)){
                        resultL = false;
                        break;
                    }
                }
                if(resultL){
                    break;
                }
                index = s.substring(i+1,j+1);
                for (int n = 0;n<index.length();n++) {
                    if (index.charAt(n) != index.charAt(index.length() - 1 - n)) {
                        resultR = false;
                        break;
                    }
                }
                break;
            }
        }
        return result || resultL || resultR;
    }

    public static void main(String[] args) {
        Problem680 p = new Problem680();
        boolean abcb = p.validPalindrome("abc");
        System.out.println(abcb);
    }


}
