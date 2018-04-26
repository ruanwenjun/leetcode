package leetcode;

import java.util.Arrays;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月26日 下午9:10:31
 */
public class Problem561 {
	/**
	 * 数组长度为2n，拆分之后适合min每一对  之和最大
	 *  1 4 3 2 
	 *  4 = 1+3
	 * @param nums
	 * @return
	 */
	public int arrayPairSum(int[] nums) {
		// 不要让一大一小在一起，尽量让大的在一起，小的在一起
		//先排序
		Arrays.sort(nums);
		//然后将0 2 ....相加
		int num = 0;
		for(int i=0 ; i<nums.length ; i=i+2) {
			num +=nums[i];
		}
		return num;
	}
	
}
