/**
 * 许可证密钥格式
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-22 11:25
 */

public class Problem482 {

    /**
     * 将S划分，其中每个组必须有K个字符，第一个组可以小于K个字符
     *
     * @param S
     * @param K
     * @return
     */
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for (int i = S.length() - 1; i >= 0;) {
            int num = 0;
            while (num < K && i >=0){
                if(S.charAt(i) != '-'){
                    if(S.charAt(i)>='0' && S.charAt(i)<='9'){
                        sb.append(S.charAt(i));
                    }else {
                        sb.append(Character.toUpperCase(S.charAt(i)));
                    }
                    num ++;
                }
                    i --;
            }
            sb.append('-');
        }
        String result =  sb.reverse().toString();
        int i = 0;
        for (;i<result.length();i++){
            if(result.charAt(i) != '-'){
                break;
            }
        }
        return result.substring(i,result.length());
    }

    public static void main(String[] args) {
        Problem482 p = new Problem482();
        String s = p.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        System.out.println(s);
    }

}
