import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 两个数组的交集二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-16 22:05
 */

public class Problem350 {
    /**
     * 输出两个数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        // 将数组排序然后查找？
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i =0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
                continue;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        int[] result = new int[list.size()];
        for (int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] num1 = new int[]{1,2,2,1};
        int [] num2 = new int[]{1,2};
        Problem350 p = new Problem350();
        System.out.println(p.intersect(num1,num2));
    }
}
