import java.util.Arrays;
import java.util.Collections;

/**
 * 两数之和二-输入有序数组
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-08 12:13
 */

public class Problem167 {
    /**
     * 有序数组
     * 返回两数之和=target的下标
     * 下标从1开始
     * 只有唯1答案
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int []result = new int[2];
        // 一个肯定大于 target/2 一个肯定小于target/2
        for (int i =0;i<numbers.length;i++){
            int j = target - numbers[i];
            int i1 = Arrays.binarySearch(numbers, j);
            if(i1>0 && i1!= i){
                if(i>i1){
                    result[1] = i+1;
                    result[0] = i1+1;
                }else {
                    result[0] = i+1;
                    result[1] = i1+1;

                }
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem167 p = new Problem167();
        int [] a = new int[]{1, 2, 3, 4,4,9,56,90};
        int[] ints = p.twoSum(a, 8);
        System.out.println(Arrays.toString(ints));
    }
}
