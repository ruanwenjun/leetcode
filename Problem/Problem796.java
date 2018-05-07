/**
 * 旋转字符串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 12:43
 */

public class Problem796 {
    /**
     * 判断A能否旋转成为B
     * @param A
     * @param B
     * @return
     */
    public boolean rotateString(String A, String B) {
        if(A.equals(B)){
            return true;
        }
        int len = A.length();
        // 进行旋转操作
        for (int i =0;i<len;i++){
            // 每次将索引为i的字母加到A最后
            if(A.equals(B)){
                return true;
            }
            // 进行旋转
            String s1 = A.substring(0, 1);
            String s2 = A.substring(1,len);
            A = s2 + s1;
        }
        return false;
    }
}
