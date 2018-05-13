package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午6:46:48
 */
public class Problem344 {
	/**
	 * 将输入的字符串反转
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseString(String s) {
		// 得到字符数组
		char[] charArray = s.toCharArray();

		int length = charArray.length - 1;
		// 循环结束
		int stop = charArray.length / 2;
		// 进行反转
		for (int i = 0; i < stop; i++) {
			char l = charArray[i];
			charArray[i] = charArray[length - i];
			charArray[length - i] = l;
		}
		return new String(charArray);
	}
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
}
