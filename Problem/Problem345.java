/**
 * 反转字符串中的元音字母
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 17:33
 */

public class Problem345 {
    /**
     * 反转字符串中的元音字母
     * @param s
     * @return
     */
    public String reverseVowels(String s) {
        // 遍历字符串，一旦发现元音字母，则将后面的原因字母与它交换
        char[] chars = s.toCharArray();
        // 记录左边的元音字母索引
        int left = 0;
        // 记录右边的元音字母索引
        int right = s.length()-1;

        for (int i =0;i<right;i++){
            if(chars[i] == 'a'||chars[i] == 'e'||chars[i] == 'i'||chars[i] == 'o'||chars[i] == 'u'||chars[i] == 'A'||chars[i] == 'E'||chars[i] == 'I'||chars[i] == 'O'||chars[i] == 'U'){
                // 从右边找到元音字母跟他交换
                for (int j = right;j>i;j--){
                    if(chars[j] == 'a'||chars[j] == 'e'||chars[j] == 'i'||chars[j] == 'o'||chars[j] == 'u'||chars[j] == 'A'||chars[j] == 'E'||chars[j] == 'I'||chars[j] == 'O'||chars[j] == 'U'){
                        char tem = chars[i];
                        chars[i] = chars[j];
                        chars[j] = tem;
                        right = j-1;
                        break;
                    }
                }
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Problem345 p  = new Problem345();
        String leetcode = p.reverseVowels("leetcode");
        System.out.println(leetcode);
    }
}
