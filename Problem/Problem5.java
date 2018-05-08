/**
 * 最长回纹子串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 8:53
 */

public class Problem5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        String result = "";
        for (int i =0;i<chars.length;i++){
            // 从第一个元素往后找包含它的回文串
            for (int j = i+1;j<chars.length;j++){
                // 判断当前[i-j]是不是回文串,如果是，那么判断长度是否大于之前的回文串
                boolean is = true;
                int h = j;
                for (int k = i;k<h;k++,h--){
                    if(chars[k] != chars[h]){
                        is = false;
                        break;
                    }
                }
                if(is){
                    if(j-i>max){
                        max = j-i;
                        result = s.substring(i,j+1);
                    }
                }
            }
        }
        if(max == 0){
            return s.substring(0,1);
        }
        return result;
    }

    public static void main(String[] args) {
        Problem5 p = new Problem5();
       String a =  p.longestPalindrome("a");
        System.out.println(a);
    }
}
