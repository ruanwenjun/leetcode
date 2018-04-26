package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月24日 下午9:46:26
 */
public class Problem476 {
	/**
	 * 取补数
	 * @param num
	 * @return
	 */
	public static int findComplement(int num) {
		//将num转换为二进制字符数组
		String x = "";
		while (num != 0) {
			x = num%2 + x ;
			num = num/2;
		}
		char[] charArray = x.toCharArray();
		int [] numArray = new int[charArray.length];
		//将每一位取反
		for(int i = 0 ; i<charArray.length ; i++) {
			if(charArray[i] == '0') {
				numArray[i]=1;
			}else {
				numArray[i]=0;
			}
		}
		//将数组变为十进制数
		int n = 1;
		int result = 0;
		for(int j =numArray.length-1;j>=0;j--) {
			result +=numArray[j]*n;
			n=n*2;
		}
		return result;
	}
	public static void main(String[] args) {
		findComplement(5);
	}
}
