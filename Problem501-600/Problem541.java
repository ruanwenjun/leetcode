/**
 * 反转字符串二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-13 13:38
 */

public class Problem541 {
    /**
     * 将每2K个字符前K个字符反转
     * 如果不足K个则将所有进行反转
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        //
        char[] chars = s.toCharArray();
        // 有多少个k
        int len = chars.length/k;
        // 将奇数个K 反转
        for (int i = 1;i<=len;i=i+2){
            // 起始 0- k-1   2k - 3k -1
            int start = (i-1)*k;
            int end = i*k-1;
            change(start,end,chars);
        }
        // 判断len是奇数还是偶数，如果是偶数则需要将后面的反转
        if(len%2 == 0){
            // 将最后的反转
            int end = chars.length-1;
            int start = len*k;
            change(start,end,chars);
        }
        return new String(chars);
    }

    /**
     * 反转字符串
     * @param start
     * @param end
     * @param chars
     */
    public void change(int start,int end,char[] chars){
        while (start<end){
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Problem541 p = new Problem541();
        String result = p.reverseStr("abcdefghijklmn", 3);
        System.out.println(result);
    }

}
