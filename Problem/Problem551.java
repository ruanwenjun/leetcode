/**
 * 学生出勤记录一
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 18:32
 */

public class Problem551 {
    /**
     * 如果这个学生的记录中不超过一个A，并且不超过两个连续的L，那么他会被奖赏
     * @param s
     * @return
     */
    public boolean checkRecord(String s) {
        // 记录A的个数
        int a = 0;
        int maxL = 0;
        // 遍历
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;){
            // 记录连续的L的个数
            int ll = 0;
            if(chars[i] == 'A'){
                a++;
                i++;
                continue;
            }
            // 连续的L
            if(chars[i] == 'L'){
                while(i<chars.length && chars[i] == 'L'){
                    ll++;
                    i++;
                }
                maxL = Integer.max(maxL,ll);

            }else {
                i++;
            }

        }

        return a<=1&&maxL<=2?true:false;
    }
}
