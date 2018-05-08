import java.util.ArrayList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 13:39
 */

public class Problem448 {
    /**
     * 采用哈希来做
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 遍历一遍数组，将值映射到一个数组上，然后找出所有没有被映射的数
        int [] a = new int[nums.length + 1];
        for (int i : nums){
            a[i]++;
        }
        List<Integer> result = new ArrayList();
        for (int i = 1;i<a.length;i++){
            if(a[i] == 0){
                result.add(i);
            }
        }
        return result;
    }
}
