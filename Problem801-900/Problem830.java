import java.util.ArrayList;
import java.util.List;

/**
 * 大组合的位置
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 15:56
 */

public class Problem830 {
    /**
     * 输出大组合的位置
     * 当连续的字母数超过三个那么就是大组合
     * @param S
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();

        char[] chars = S.toCharArray();
        for (int i=0;i<chars.length;i++){
            // 记录连续的相同的字母的个数
            int count = 1;
            // 记录结尾的索引位置
            int last = i;
            for (int j=i+1;j<chars.length;j++){
                if(chars[j] == chars[i]){
                    count++;
                    last = j;
                }else {
                    break;
                }

            }
            if(count>=3){
                // 添加到集合
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(last);
                result.add(list);
                i = last;
            }
        }
        return result;
    }


}
