import java.util.ArrayList;
import java.util.List;

/**
 * 棒球比赛
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 18:16
 */

public class Problem682 {
    /**
     * 计算得分
     * 整数：代表得分
     * "+" 本轮得分是前两轮有效得分之和
     * "D" 本轮得分是前一轮有效得分的两倍
     * "C" 最后一个有效得分无效
     *
     * @param ops
     * @return
     */
    public int calPoints(String[] ops) {
        // 使用列表来记录得分
        List<Integer> list = new ArrayList<>();
        int count = 0;
        // 记录当前轮的得分
        int index =0;
        for (String s : ops) {
            int length = list.size();
            if (s.equals("+")) {
                index = list.get(length - 1) + list.get(length - 2);

            }else if(s.equals("D")){
                index = list.get(length -1)*2;

            }else if(s.equals("C")){
                index = list.get(length-1);
                count -=index;
                list.remove(length-1);
                continue;
            }else {
                index = Integer.parseInt(s);

            }
            count +=index;
            list.add(index);
        }
        return count;
    }
}
