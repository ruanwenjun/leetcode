package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午6:31:08
 */
public class Problem557 {
	/**
	 * 反转字符串的字母位置
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseWords(String s) {
		// 先将字符用空格分开
		String[] split = s.split(" ");
		String result = "";
		for (String string : split) {

			// 当前不是空格的情况，需要反转
			char[] charArray = string.toCharArray();
			int stop = charArray.length - 1;
			int length = charArray.length / 2;
			for (int i = 0; i < length; i++) {
				char f = charArray[i];
				char l = charArray[stop - i];
				// 交换
				charArray[i] = l;
				charArray[stop - i] = f;
			}
			// 反转完毕后
			result += new String(charArray);
			//每个后面加上一个空格
			result +=" ";
		}
		//去掉最后一个空格
		
		return result.substring(0, result.length()-1);
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
}
