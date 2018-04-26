package leetcode;


/**
 * 宝石与石头
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月24日 下午6:00:42
 */
public class Problem771 {
	 // j代表宝石，S代表你拥有的石头
    public int numJewelsInStones(String J, String S) {
        //1.先将J，S解析为字符数组
        char[] gems = J.toCharArray();
        char[] stons = S.toCharArray();
        //拥有的宝石总数
        int num = 0;
        //2.遍历J
        for (char gem : gems) {
        	//3.遍历S，如果S中出现J则总数+1
			for (char c : stons) {
				if(c==gem) {
					num ++;
				}
			}
		}
    	return num;
    }
	
}
