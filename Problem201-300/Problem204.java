/**
 * 计数质数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-31 20:46
 */

public class Problem204 {
    /**
     * n 是一个非负质数
     * 统计所有小于n的质数个数
     * 思路：将所有质数的倍数都标记为非质数
     *
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        // 记录质数的个数
        int count = 0;
        // 记录当前数是否为质数,false表示是质数
        boolean[] prime = new boolean[n + 1];
        if (n <= 1) {
            return count;
        }
        for (int i = 2; i * i < n; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2;i<n;i++){
            if(!prime[i]){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Problem204 p = new Problem204();
        int i = p.countPrimes(130);
        System.out.println(i);
    }
}
