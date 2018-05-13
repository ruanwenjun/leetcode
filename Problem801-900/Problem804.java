package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ruanwenjun E-mail:861923274@qq.com
 * @date 2018年4月25日 下午12:51:56
 */
public class Problem804 {
	/**
	 * 翻译摩斯密码
	 * @param words
	 * @return
	 */
	public static int uniqueMorseRepresentations(String[] words) {
		//或得密码表数组
		String[] mima = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set set = new HashSet<String>();
		//遍历输入的每一个单词
		for (String word : words) {
			//将单词拆分为字母
			char[] wordArray = word.toCharArray();
			//当前单词对应的密码
			String indexWordMima = "";
			for (char c : wordArray) {
				int index = c - 97;
				//获得当前字母对应的密码
				String indexCharMima = mima[index];
				indexWordMima =indexWordMima + indexCharMima;
			}
			//将当前单词对应的密码加到set
			set.add(indexWordMima);
		}
		return set.size();
	}

	public static void main(String[] args) {
		String[] words = new String[] {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
		System.out.println(uniqueMorseRepresentations(words));
	}
}
