import java.util.BitSet;

/**
 * TinyURL的加密与解密
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 12:57
 */

public class Problem535 {

    /**
     * 加密
     *
     * @param longUrl
     * @return
     */
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        char[] chars = longUrl.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 如果是小写字母
            if ((chars[i] >= 'a' && chars[i] <= 'z')) {
                if (chars[i] == 'a') {

                    chars[i] = 'z';
                } else {
                    chars[i] = (char) (chars[i] - 1);

                }
            }
            // 如果是大写字母
            if ((chars[i] >= 'A' && chars[i] <= 'Z')) {
                if (chars[i] == 'A') {
                    chars[i] = 'Z';
                } else {
                    chars[i] = (char) (chars[i] - 1);
                }
            }
        }
        return new String(chars);
    }

    /**
     * 解密
     *
     * @param shortUrl
     * @return
     */
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        char[] chars = shortUrl.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // 如果是小写字母
            if ((chars[i] >= 'a' && chars[i] <= 'z')) {
                if (chars[i] == 'z') {
                    chars[i] = 'a';
                } else {
                    chars[i] = (char) (chars[i] + 1);
                }
            }
            if ((chars[i] >= 'A' && chars[i] <= 'Z')) {
                if (chars[i] == 'Z') {
                    chars[i] = 'A';
                } else {
                    chars[i] = (char) (chars[i] + 1);
                }
            }

        }
        return new String(chars);


    }
}
