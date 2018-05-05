import java.util.Arrays;
import java.util.logging.Level;

/**
 * 买卖股票的最佳时机
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 17:16
 */

public class Problem122 {
    /**
     * 第i个元素是第i天的股票价格
     * 每一天只能买或者卖
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        // 如果后面比它小，那么不买，否则买入
        int count = 0;
        for (int i=0;i<prices.length;i++){
            // 买入价格
            int buy = 0;
            if(i+1<prices.length && prices[i]<prices[i+1]){
                // 买入
                buy = prices[i];
                // 如果后面没它大，那么卖出
                for (int j = i+1;j<prices.length;j++){
                    if(j+1<prices.length && prices[j]>=prices[j+1]){
                        // 卖出
                        count += prices[j]-buy;
                        i = j;
                        break;
                    }else if(j+1>=prices.length){
                        // 卖出
                        count += prices[j]-buy;
                        i = j;
                    }

                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem122 p = new Problem122();
        int[] t = new int[]{1,2,3,4,5};
        System.out.println(p.maxProfit(t));
    }

}
