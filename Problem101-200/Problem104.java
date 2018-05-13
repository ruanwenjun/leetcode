package leetcode;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午6:53:42
 */
public class Problem104 {
	/**
	 * 二叉树的最大深度,采用递归的方式
	 * 3,9,20,null,null,15,7
	 * @param root
	 * @return
	 */
	public int maxDepth(TreeNode root) {
		int maxHight = 0;
		//当前节点不为空
		if(root != null) {
			maxHight +=1;
			int leftHight = maxDepth(root.left);
			int rightHight = maxDepth(root.right);
			return (leftHight>rightHight?leftHight+maxHight:rightHight+maxHight);
		}else {
			return 0;
		}
	}
}


