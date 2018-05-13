/**
 * 旋转数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-01 19:03
 */

public class Problem788 {
    /**
     * 计算从1到N中有多少个数是好数
     * 好数：数的每一位旋转后还是一个数，并且与自己不同，0，1，8旋转后是自己，2，5，6，9旋转后为对方
     * @param N
     * @return
     */
    public static int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1;i<=N;i++){
            // 判断i是否为好数
            String s = i+"";
            char[] chars = s.toCharArray();
            // 判断当前位是否为0182569
            // 如果不包含2569那么肯定不是好数
            char[] result = new char[chars.length];
            int index = 0;
            boolean isNum = true;
            for (char c : chars){
                if(c == '2'){
                    result[index++] = '5';
                    continue;
                }
                if(c == '5'){
                    result[index++] = '2';
                    continue;
                }
                if (c == '6') {
                    result[index++] = '9';
                    continue;
                }
                if(c == '9'){
                    result[index++] = '6';
                    continue;
                }
                if(c == '0'||c=='1'||c=='8'){
                    result[index++] = c;
                    continue;
                }
                isNum = false;
                break;
            }
            String r = new String(result);
            // 判断两个数是否相等
            boolean isGood = r.equals(s) ;
            if(!isGood && isNum){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(rotatedDigits(857));
    }
}
