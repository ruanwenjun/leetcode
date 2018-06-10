import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 大礼包
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-09 19:56
 */

public class Problem638 {
    int minCount;

    /**
     * 第一个列表表示每个物品的价格
     * 第二个列表表示大礼包
     * 第三个列表表示需要买的物品数
     * 输出最低花费
     *
     * @param price
     * @param special
     * @param needs
     * @return
     */
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        // 记录不买礼包的花费
        for (int i = 0; i < needs.size(); i++) {
            minCount += needs.get(i) * price.get(i);
        }
        helper(price, special, needs, 0);
        return minCount;
    }

    /**
     * @param price   每件的价格
     * @param special 礼包
     * @param needs   剩余的需要
     * @param count   当前的花费
     * @return
     */
    public void helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int count) {
        int index = 0;
        for (int i : needs) {
            index += i;
        }
        if (index == 0) {
            if (count < minCount) {
                minCount = count;
            }
            return;
        }
        for (int i = 0; i < special.size(); i++) {
            // 当前礼包可不可用的标志
            boolean can = true;
            // 当前的花费
            List<Integer> list = special.get(i);
            // 当前的需要
            List<Integer> flashNeed = new ArrayList<>(needs);
            for (int j = 0; j < flashNeed.size(); j++) {
                if (flashNeed.get(j) >= list.get(j)) {
                    flashNeed.set(j, flashNeed.get(j) - list.get(j));
                }else {
                    can = false;
                    break;
                }
            }
            if(can){
                helper(price,special,flashNeed,count + list.get(list.size() - 1));
            }
        }
        // 不买礼包的花费
        int indexCount = count;
        for (int i = 0; i < needs.size(); i++) {
            indexCount += needs.get(i) * price.get(i);
        }
        if(indexCount < minCount){
            minCount = indexCount;
        }
    }

    public static void main(String[] args) {
        Problem638 p = new Problem638();

    }
}
