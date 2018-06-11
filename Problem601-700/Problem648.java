import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 单词替换
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 21:06
 */

public class Problem648 {
    /**
     * 将继承词用词根替换
     *
     * @param dict
     * @param sentence
     * @return
     */
    public String replaceWords(List<String> dict, String sentence) {
        if(sentence == null || sentence.equals(" ")){
            return null;
        }
        // 采用暴力法
        StringBuilder sb = new StringBuilder();
        // 将词根排序
        String[] dictString = new String[dict.size()];
        for (int i = 0; i < dict.size();i++){
            dictString[i] = dict.get(i);
        }
        Arrays.sort(dictString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return 0;
                }
                return o1.length() < o2.length() ? -1 : 1;
            }
        });

        String[] split = sentence.split(" ");
        for (String s : split) {
            boolean can = false;
            // 判断能否用词根替换
            for (String ds : dictString){
                if(s.startsWith(ds)){
                    can = true;
                    sb.append(ds);
                    break;
                }
            }
            if(!can){
                sb.append(s);
            }
            sb.append(" ");
        }
        return sb.delete(sb.length() - 1,sb.length()).toString();
    }
}
