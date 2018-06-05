/**
 * 只出现一次的数字二
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-04 22:08
 */

public class Problem137 {
    /**
     * 数组中只有一个元素出现了一次，其余元素都出现了三次，找出出现一次的那个元素
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++){
            int bit = 1 << i,index = 0;
            for (int j = 0; j < nums.length; j++){
                int a = nums[j]&bit;
                if(a != 0){
                    index ++;
                }
            }
            if(index % 3 != 0){
                result = result | bit;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem137 p = new Problem137();
        int[] a = new int[]{2, 2, 3, 2};
        System.out.println(p.singleNumber(a));
    }
}
