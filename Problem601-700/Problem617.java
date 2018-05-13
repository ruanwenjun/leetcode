package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月26日 下午8:36:10
 */
public class Problem617 {
	/**
	 * 合并二叉树
	 * @param t1
	 * @param t2
	 * @return
	 */
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		//采用递归的思路
		//如果当前节点有一个为空，那么返回不为空的那个
		if(t1 == null || t2 == null) {
			return t1==null?t2:t1;
		}
		//将两个节点值相加
		t1.value += t2.value;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}
}



