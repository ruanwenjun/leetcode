/**
 * 可怜的小猪
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 13:01
 */

public class Problem458 {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int cs = minutesToTest/minutesToDie;
        double v = Math.log(buckets) / Math.log(cs - 1) * cs;
        return (int) v;
    }
}
