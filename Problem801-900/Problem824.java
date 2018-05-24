/**
 * 翻译成山羊拉丁语
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-23 13:09
 */

public class Problem824 {
    /**
     * 句子由空格分隔
     * 如果一个单词以元音开头，则加ma到末尾
     * 如果以辅音开头则将第一个字母删除加到末尾
     * 同时从第一个单词开始每个单词后面+i个a
     *
     * @param S
     * @return
     */
    public String toGoatLatin(String S) {
        // 遍历句子
        String[] split = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            // 处理每个单词
            String index = split[i];
            StringBuilder stringBuilder = new StringBuilder();
            boolean isYuanYin = index.charAt(0) == 'a' || index.charAt(0) == 'A' || index.charAt(0) == 'e'
                    || index.charAt(0) == 'E' || index.charAt(0) == 'i' || index.charAt(0) == 'I'
                    || index.charAt(0) == 'o' || index.charAt(0) == 'O' || index.charAt(0) == 'u'
                    || index.charAt(0) == 'U';
            if (!isYuanYin) {
                // 不是元音
                stringBuilder.append(index.substring(1, index.length())).append(index.substring(0, 1));
            }else {
                // 是元音
                stringBuilder.append(index);
            }
            // 加ma
            stringBuilder.append("ma");
            // 加a
            for (int j = 0; j <= i; j++) {
                stringBuilder.append("a");
            }
            sb.append(stringBuilder);
            if (i != split.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem824 p = new Problem824();
        String i_speak_goat_latin = p.toGoatLatin("I speak Goat Latin");
        System.out.println(i_speak_goat_latin);
    }
}
