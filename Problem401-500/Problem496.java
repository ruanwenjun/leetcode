/**
 * 下一个更大元素
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 22:05
 */

public class Problem496 {
    /**
     * 找到nums1中每一个元素在nums2中的下一个更大元素，如果没有，则输出-1
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int index = nums1[i];
            // 在nums2中是否存在当前元素的标识
            boolean flag = false;
            boolean has = false;
            for(int j=0;j<nums2.length;j++){
                if(index == nums2[j]){
                    flag = true;
                }
                if(nums2[j] > index && flag){
                    nums1[i] = nums2[j];
                    has = true;
                    break;
                }
            }
            if(!has){
                nums1[i] = -1;
            }
        }
        return nums1;

    }

    public static void main(String[] args) {
        int [] n1 = new int[]{4,1,2};
        int [] n2 = new int[]{1,3,4,2};
        nextGreaterElement( n1,n2);
    }
}
