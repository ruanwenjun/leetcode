/**
 * 重复的子字符串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-13 18:28
 */

public class Problem459 {
    /**
     * 判断s能否由它的子字符串重复多次得到
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {

        StringBuilder sb ;
        for (int i = 1;i<=s.length()/2;i++){
            sb = new StringBuilder();
            String substring = s.substring(0, i);
            // s的长度必须是子串的长度的正数倍
            if(s.length()%substring.length()!= 0 && substring.length() != 1){
                continue;
            }
            int num = s.length()/substring.length();
            while (num >0){
                sb.append(substring);
                num --;
            }
            if(sb.toString().equals(s)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Problem459 p = new Problem459();
//        StringBuilder sb = new StringBuilder();
//        for (int i =0;i<10000;i++){
//            sb.append("a");
//        }
        boolean result = p.repeatedSubstringPattern("bca");
        System.out.println(result);
    }
}
