/**
 * 第个数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-28 17:05
 */

public class Problem400 {
    /**
     * 在无限的整数序列中找到第N个数字
     * 数字在0-9
     *
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int result = 0;
        int i = 1;
        long j = 9;
        int index = 1;
        // 记录当前有多少个数字
        long count = i * j;
        while (true) {
            if (count < n ) {
                j = j * 10;
                index = index * 10;
                i++;
                count = count + i * j;
            } else {
                break;
            }
        }
        // 此时count >=n，找到该区间的第一个
        count = count - i * j + 1;
        while (count + i <= n) {
            count = count + i;
            index++;
        }

        int k = 0;
        while (count < n) {
            // 此时j的最高位
            k++;
            count++;

        }
        String s = String.valueOf(index);
        result = s.charAt(k) - '0';

        return result;
    }

    public static void main(String[] args) {
        Problem400 p = new Problem400();
        int nthDigit = p.findNthDigit(2147483647);
        System.out.println(nthDigit);

    }
}
