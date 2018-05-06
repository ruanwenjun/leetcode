import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 两个列表的最小索引总和
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 19:46
 */

public class Problem599 {
    /**
     * 找出两个列表中相同元素，要求具有最小索引和
     *
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        int length = list1.length + list2.length;
        // 最小索引和
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < list1.length && j <= i; j++) {
                if (i - j < list2.length && list1[j].equals(list2[i - j])) {
                    // 相等，加入结果
                    result.add(list1[j]);
                }
            }
            if(!result.isEmpty()){
                break;
            }
        }
        String[] objects = new String[result.size()];
        objects = result.toArray(objects);
        return objects;
    }
}
