/**
 * 种花问题
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 17:11
 */

public class Problem605 {
    /**
     * 0表示没种花，1表示种花花不能种在相邻两块地
     * 问能否再种n朵花
     *
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 从前往后找空地，每找到一个就种一朵
        for (int i = 0; i < flowerbed.length; i++) {
            boolean canPlace = (i - 1 < 0 || flowerbed[i - 1] == 0)
                && flowerbed[i] == 0 && (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0);
            if (canPlace) {
                n--;
                // 如果当前种了花那么下一个需要跳过
                i++;
            }
        }
        return n <= 0;
    }
}
