/**
 * 最后一个单词的长度
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 11:26
 */

public class Problem58 {
    /**
     * 返回最后一个单词的长度
     * 一个单词是指由字母构成，不包含空格的字符串
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        // 遍历字符串
        // 保存上一个单词的长度
        int lastLen = 0;

        for (int i = 0;i<s.length();i++){
            if(s.charAt(i) != 32){
                int count = 0;
                for (int j = i;j<s.length();j++){
                    if(s.charAt(j) != 32){
                        i = j;
                        count ++;
                    }else {
                        i = j;
                        break;
                    }
                }

                lastLen = count;
            }
        }
        return lastLen;
    }

    public static void main(String[] args) {
        Problem58 p = new Problem58();
        System.out.println((int)' ' );
        int hello_world = p.lengthOfLastWord("Hello World i");
        System.out.println(hello_world);

    }
}
