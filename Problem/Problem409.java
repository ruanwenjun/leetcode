/**
 * 最长回文串
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-07 18:41
 */

public class Problem409 {
    /**
     * 找到利用字符串中的字母构成的最长回文串的长度
     * @param s
     * @return
     */
    public int longestPalindrome(String s) {
        // 及必须包含若干偶数对的字母
        // 保存字母出现的次数
        int [] num = new int[256];
        for (char c : s.toCharArray()){
            num[c]++;
        }
        int count = 0;
       boolean hasJS = false;
        for (int i =0;i<256;i++){
           if(num[i]%2 == 0){
               count +=num[i];
           }else {
               // 奇数的情况
               hasJS = true;
               count +=num[i]-1;
           }

        }
        if(hasJS){
            return count+1;
        }else {
            return count;
        }
    }

    public static void main(String[] args) {
        Problem409 p = new Problem409();
        int i = p.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
        System.out.println(i);
    }
}
