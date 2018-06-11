/**
 * 到最近的人的最大距离
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 9:46
 */

public class Problem849 {
    /**
     * 1代表有人 0 代表没人 找到离最近的人的距离最大的空位
     *
     * @param seats
     * @return
     */
    public int maxDistToClosest(int[] seats) {
        // 思路：记录前一个有人的下标，记录当前有人的下标，两个中间就是最大的
        // 前一个有人的下表
        int first = 0;
        // 当前有人的下标
        int index = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                index = i;
                break;
            }
        }
        // 距离最大值
        int max = index - first;
        first = index;
        for (int i = first + 1; i < seats.length; i++) {
            if (seats[i] == 1) {
                index = i;
                int now = (index - first) / 2;
                if(now > max){
                    max = now;
                }
                first = index;
            }
        }
        if(seats.length - 1 - first > max){
            max = seats.length - 1 - first;
        }
        return max;
    }

    public static void main(String[] args) {
        Problem849 p = new Problem849();
        int[] seats = new int[]{0,0,0,1};
        int i = p.maxDistToClosest(seats);
        System.out.println(i);
    }
}
