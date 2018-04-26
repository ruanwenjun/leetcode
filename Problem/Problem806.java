package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月26日 下午9:24:29
 */
public class Problem806 {
	/**
	 * 写字符串
	 * widths长度在2-10
	 * 每行最大为100
	 * @param widths
	 * @param S
	 * @return
	 */
	public static int[] numberOfLines(int[] widths, String S) {
		//将S解析为数组
		char[] charArray = S.toCharArray();
		//遍历数组
		int width =0;
		//记录当前有多少行
		int row = 0;
		//记录最后一行有多宽
		int lastWidth = 0;
		for(int i =0;i<charArray.length;) {
			//当前字母的宽度
			int w = widths[charArray[i] - 'a'];
			
			if(width - w >=0) {
				width = width -w;
				lastWidth +=w;
				i++;
				continue;
			}
			//当前行装不下了
			row++;
			width = 100;
			lastWidth = 0;
		}
		
		int[] result = new int[] {row,lastWidth}; 
		return result;
				
	}
	public static void main(String[] args) {
		int [] num = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		System.out.println(numberOfLines(num,"abcdefghijklmnopqrstuvwxyz")[0]+"-----"+numberOfLines(num,"abcdefghijklmnopqrstuvwxyz")[1]);
	}
}
