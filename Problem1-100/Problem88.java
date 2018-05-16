import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 合并两个有序数组
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-15 22:09
 */

public class Problem88 {
    /**
     * 给定两个有序数组，将nums2合并到nums1
     * 初始化两个数组的元素数量分别为m,n
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 采用插入排序
        int i = m-1;
        // 有序的索引
        int q = nums1.length - 1;
        int index = -1;
        for (int p = nums2.length - 1; p >= 0 && i >= 0; ) {
            if (nums1[i] >= nums2[p]) {
                nums1[q--] = nums1[i--];
            } else {
                nums1[q--] = nums2[p--];
                index = p;
            }
        }
        if (index >= 0){
            for (int j = 0;j<=index;j++){
                nums1[j] = nums2[j];
            }
        }

    }

    public static void main(String[] args) {
        int[] num1 = new int[]{2, 2, 2, 0, 0, 0};
        int[] num2 = new int[]{1, 4, 4};
        Problem88 p = new Problem88();
        p.merge(num1, 3, num2, 3);
        System.out.println(num1);
    }
}
