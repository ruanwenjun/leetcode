package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月24日 下午10:08:54
 */
public class Problem728 {
	/**
	 * 自除数
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		// 判断每一个数是否为自除数
		for (int i = left; i <= right; i++) {
			list.add(i);
			// 获取他的每一位数
			String string = i + "";
			StringBuilder sb = new StringBuilder(string);
			int[] numArray = new int[sb.length()];
			for (int j = 0; j < sb.length(); j++) {
				numArray[j] = new Integer(sb.substring(j, j+1));
			}
			
			// 遍历每一位数，判断是否能被除尽
			for (int x : numArray) {
				if( x == 0 || i%x!=0 ) {
					list.remove(list.size()-1);
					break;
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		selfDividingNumbers(1, 22);
	}
}
