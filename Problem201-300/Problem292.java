package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午5:26:03
 */
public class Problem292 {
	/**
	 * 判断是否能赢得游戏
	 * 每次轮流拿1-3块石头
	 * 拿到最后一块石头的赢
	 * @param n
	 * @return
	 */
	public static boolean canWinNim(int n) {
		//每个人都想办法让当前的石头拿完之后是4个，如果可以办到那么当前的人就赢了，否则只拿一个
		if(n<4) {
			return true;
		}
		if(n%4==0) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(canWinNim(1348820612));
	}
}
