/**
 * 买卖股票的最佳时机
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 13:48
 */

public class Problem121 {
    /**
     * 最多只能完成一笔交易
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<prices.length;i++){
            for (int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max>0?max:0;
    }
}
