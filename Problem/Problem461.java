package leetcode;


/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月24日 下午7:31:34
 */
public class Problem461 {
	/**
	 * 统计汉明距离
	 * @param x
	 * @param y
	 * @return
	 */
	public int hammingDistance() {
		int x = 1;
		int y = 4;
		//将x,y解析成二进制数
		StringBuilder sb1 = toBinatry(x);
		StringBuilder sb2 = toBinatry(y);
		int i = sb1.length() - sb2.length();
		if(i>0) {
			//x转为二进制的长度长，将y补0
			while(i>0) {
				sb2.append("0");
				i--;
			}
		}else {
			//y转为二进制的长度长
			i = -i;
			while (i>0) {
				sb1.append("0");
				i--;
			}
		}
		//比较
		char[] charX = sb1.toString().toCharArray();
		char[] charY = sb2.toString().toCharArray();
		int dif = 0;
		for (int j = 0; j < charY.length; j++) {
			if(charX[j] != charY[j]) {
				dif++;
			}
		}
		return dif;
	}
	/**
	 * 将x解析为一个二进制数
	 * @param x
	 * @return
	 */
	public StringBuilder toBinatry(int x) {
		StringBuilder sb = new StringBuilder();
		//x除2
		while(x!=0) {
			sb.append(x%2+"");
			x=x/2;
		}
		
		return sb;
	}
}
