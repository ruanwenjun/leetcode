/**
 * 回文子串
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-13 10:09
 */

public class Problem647 {
    int[][] isSubString;
    /**
     * 计算有多少回文子串，具有不同开始位置或结束位置的子串，即使是由相同的字符组成也会被计为不同的子串
     * 思路：从计算每个位置开头的回文子串
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {

        isSubString = new int[s.length()][s.length()];
        // isSubString[i][j]记录从i到j的子串是否是回文子串
        // 每个单独的字母都是回文子串
        for (int i = 0; i < s.length(); i++) {
            isSubString[i][i] = 1;
        }
        for (int i = 0; i < s.length(); i ++){
            for (int j = i;j < s.length(); j ++){
                isSubString[i][j] = calcute(i,j,s);
            }
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i ++){
            for (int j = i;j < s.length(); j ++){
                if(isSubString[i][j] == 1){
                    sum++;
                }
            }
        }
        return sum;
    }

    /**
     * 判断s从i到j是否是回文串
     * @param i
     * @param j
     * @param s
     * @return
     */
    public int calcute(int i , int j ,String s){
        if(isSubString[i][j] != 0){
            return isSubString[i][j];
        }
        if(i >= j){
            return 1;
        }
        if(s.charAt(i) == s.charAt(j)){
            return calcute(i+1,j-1,s);
        }
        return -1;
    }

    public static void main(String[] args) {
        Problem647 p = new Problem647();
        int abc = p.countSubstrings("aaaa");
        System.out.println(abc);
    }
}
