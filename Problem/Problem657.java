package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月24日 下午7:23:42
 */
public class Problem657 {

	/**
	 * 判断是否会回到原点
	 * @param moves
	 * @return
	 */
	public boolean judgeCircle(String moves) {
		//解析字符串
		char[] arrays = moves.toCharArray();
		int u = 0;
		int d = 0;
		int r = 0;
		int l = 0;
		//遍历字符串，统计 U D R L 的数目
		for (char c : arrays) {
			switch (c) {
			case 'U':
				u++;
				break;
			case 'D':
				d++;
				break;
			case 'R':
				r++;
				break;
			case 'L':
				l++;
				break;
			default:
				break;
			}
		}
		
		return (u-d==0 && r-l==0)?true:false;
	}
}
