/**
 * 爬楼梯
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 11:23
 */

public class Problem70 {
    private int[] num ;
    public int climbStairs(int n) {

        num = new int[n];
        num[1] = 2;
        num[0] = 1;
        return count(n);
    }

    /**
     * 计算爬n个台阶共有多少中方法
     * @param n
     * @return
     */
    private int count(int n){
        if( num[n - 1] != 0){
            return num[n - 1];
        }
        // 如果当前没有的情况没有出现在数组中，需要递归计算，然后存放到数组中
        int m = count(n-1) + count( n- 2);
        num[n - 1] = m;
        return m;

    }

    public static void main(String[] args) {
        Problem70 p = new Problem70();
        int i = p.climbStairs(6);
        System.out.println(i);
    }
}
