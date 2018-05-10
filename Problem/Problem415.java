import java.util.Arrays;

/**
 * 字符串相加
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-09 13:30
 */

public class Problem415 {
    /**
     * 将两个字符串相加
     *
     * @param num1
     * @param num2
     * @return
     */
    public String addStrings(String num1, String num2) {
        char[] chars = num1.toCharArray();
        char[] chars1 = num2.toCharArray();

        StringBuilder sb = new StringBuilder();
        // 遍历字符串
        // 表示进位
        int index = 0;
        for (int i = 0; i<chars.length && i< chars1.length;i++){
            char aChar = chars[chars.length - 1 - i];
            char c = chars1[chars1.length - 1 - i];
            int j = aChar - '0' + c - '0';
            if(j + index >=10){
                sb.append(j+index-10);
                index = 1;
            }else {
                sb.append(j+index);
                index = 0;
            }
        }
        int j = 1;
        while (chars.length < chars1.length && j <=chars1.length-chars.length) {
            int c = chars1[(chars1.length - j - chars.length)] - '0';
            if(c+index>=10){
                sb.append(c+index-10);
                index = 1;
            }else {
                sb.append(c+index);
                index = 0;
            }
            j++;
        }
        while (chars1.length < chars.length && j <= chars.length - chars1.length) {
            int c = chars[(chars.length - j - chars1.length)] - '0';
            if(c+index>=10){
                sb.append(c+index-10);
                index = 1;
            }else {
                sb.append(c+index);
                index = 0;
            }
            j++;
        }
        if(index == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Problem415 p = new Problem415();
        String s = p.addStrings("9", "12");
        System.out.println(s);
    }
}
