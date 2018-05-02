import javax.xml.stream.FactoryConfigurationError;

/**
 * 检测大写字母
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 19:44
 */

public class Problem520 {
    /**
     * 当所有字母都是大写或者小写
     * 或者只有首字母是大写
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        // 循环遍历一次字符串
        //首字母是大写
        // 除首字母外是否有小写
        boolean hasSmall = false;
        // 除首字母外是否有大写
        boolean hasBig = false;
        boolean isSmall = false;
        boolean isBig = false;
        char[] chars = word.toCharArray();
        if(chars[0] >='a' && chars[0] <='z'){
            // 首字母是小写
            isSmall = true;
        }else{
            isBig = false;
        }
        // 从第二个开始遍历
        for (int i = 1;i<chars.length;i++){
            // 当前字母是大写
            if(chars[i] >= 'A' && chars[i] <='Z' ){
                hasBig = true;
            }else {
                hasSmall = true;
            }
        }
        if(hasBig && hasSmall){
            return false;
        }
        if(isSmall && hasBig){
            return false;
        }
        return true;
    }
}
