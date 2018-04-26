package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午1:18:49
 */
public class Problem500 {
	/**
	 * 给定一个字符串数组，输出能够用键盘同一行打印出来的字符串
	 * @param words
	 * @return
	 */
	public String[] findWords(String[] words) {
		//定义三个字符数组
		char [] first = new char[] {'q','w','e','r','t','y','u','i','o','p'};
		char [] second = new char[] {'a','s','d','f','g','h','j','k','l'};
		char [] third = new char[] {'z','x','c','v','b','n','m'};
		List<String> list = new ArrayList<String>();
		//遍历输入的单词
		for (String word : words) {
			//将单词转换为小写
			String lword = word.toLowerCase();
			//是否拥有当前行的标志
			int hasFirst = 0;
			int hasSecond = 0;
			int hasThird = 0;
			//遍历每一个字符数组
			if(hasFirst == 0) {
				for(char f : first) {
					//判断是否包含该字符
					String index = f+"";
					if(lword.indexOf(index) != -1) {
						//表示包含当前的字母
						hasFirst = 1;
						break;
					}
				}				
			}
			if(hasSecond == 0) {
				for(char f : second) {
					//判断是否包含该字符
					String index = f+"";
					if(lword.indexOf(index) != -1) {
						//表示包含当前的字母
						hasSecond = 1;
						break;
					}
				}				
			}
			if(hasThird == 0) {
				for(char f : third) {
					//判断是否包含该字符
					String index = f+"";
					if(lword.indexOf(index) != -1) {
						//表示包含当前的字母
						hasThird = 1;
						break;
					}
				}				
			}
			if(hasFirst+hasSecond+hasThird==1) {
				//表示符合
				list.add(word);
			}
		}
		String [] result = new String[list.size()];
		for(int i = 0;i<list.size();i++) {
			result[i]=list.get(i);
		}
		return result;
	}
}
