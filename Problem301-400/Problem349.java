import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 22:21
 */

public class Problem349 {
    /**
     * 给定两个数组，输出他们的交集
     * 结果必须是唯一的
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // 首先将两个数组中的重复元素都清除
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            set1.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : set1){
            if(set.contains(i)){
                list.add(i);
            }
        }
        int [] result = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
