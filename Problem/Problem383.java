/**
 * 赎金信
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 16:24
 */

public class Problem383 {
    /**
     * 判断第一个字符串能够由第二个字符串中的字母构成
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        // 计算每一字符串中每一个字母的个数
        // 第一个字符串中每一字母的个数
        int[] noteNum = new int[26];
        char[] charsA = ransomNote.toCharArray();
        for (char c : charsA) {
            noteNum[c - 'a']++;
        }
        int[] magazineNum = new int[26];
        char[] charsB = magazine.toCharArray();
        for (char c : charsB) {
            noteNum[c - 'a']--;
        }
        // 判断noteNum中是否存在大于0的数
        for (int i : noteNum) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
