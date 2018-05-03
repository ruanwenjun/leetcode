import java.util.Arrays;

/**
 * 找不同
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 16:58
 */

public class Problem389 {
    /**
     * 找出在字符串t中添加的那个字母
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        // 可以使用异或来做
        // 将字符串进行排序，然后遍历
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);
        for(int i  = 0; i<charsS.length;i++){
            if(charsS[i] != charsT[i]){
                return charsT[i];
            }
        }
        return charsT[charsT.length-1];
    }

}
