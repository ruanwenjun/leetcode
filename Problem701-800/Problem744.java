/**
 * 寻找比目标字母大的最小字母
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 16:20
 */

public class Problem744 {
    /**
     * 如果不存在比target大的字母，则返回第一个字母
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters){
            if(c - target >0){
                return c;
            }
        }
        return letters[0];
    }

}
