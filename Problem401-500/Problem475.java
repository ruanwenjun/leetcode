import java.util.Arrays;

/**
 * 供暖气
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-30 21:10
 */

public class Problem475 {
    /**
     * 要求输出供暖器的最小半径，保证所有房屋都能得到供暖
     *
     * @param houses
     * @param heaters
     * @return
     */
    public int findRadius(int[] houses, int[] heaters) {
        // 遍历房屋，找到离他最近的供暖器并记录距离
        int max = 0;
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i++) {
            // 找到离当前房屋最近的供暖器
            int start = 0;
            int end = heaters.length - 1;
            if (houses[i] < heaters[start]) {
                max = Math.max(max, heaters[start] - houses[i]);
                continue;
            } else if (houses[i] > heaters[end]) {
                max = Math.max(max, houses[i] - heaters[end]);
                continue;
            }
            while (start <= end) {
                if (start == end) {
                    max = Math.max(max, Math.abs(houses[i] - heaters[start]));
                    break;
                }
                if (start + 1 == end) {
                    max = Math.max(max, Math.min(houses[i] - heaters[start], heaters[end] - houses[i]));
                    break;
                }
                int mid = start + (end - start)/2;
                if(heaters[mid] > houses[i] ){
                    end = mid;
                }else if(heaters[mid] == houses[i]){
                    break;
                }else {
                    start = mid;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Problem475 p = new Problem475();
        //[282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923]
        //[823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612]
        int[] a = new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
        int[] b = new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
        int radius = p.findRadius(a, b);
        System.out.println(radius);
    }
}
