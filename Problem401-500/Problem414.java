/**
 * 第三大的数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-26 14:49
 */

public class Problem414 {
    /**
     * 返回数组中第三大的数，如果不存在则返回最大的数
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        int len = 0;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        // 遍历一遍数组，不断更新第一第二第三大的数
        for (int i : nums){
            if(i > first){
                len ++;
                int tem = first;
                first = i;
                third = second;
                second = tem;
            }else if(i == first){
                    if(len == 0){
                        len ++;
                    }
                   continue;
            }else if(i > second){
                len ++;
                third = second;
                second = i;
            }else if(i == second){
                if(len == 1){
                    len ++;
                }
                continue;
            }else if(i >=third){
                len ++;
                third = i;
            }
        }
        if(len >=3){
            return third;
        }
        return first;
    }
}
