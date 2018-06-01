/**
 * 第一个错误的版本
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-31 12:41
 */

public class Problem278 {
    /**
     * 判断导致后面错误的第一个错误的版本号 1,2,3,...n
     * isBadVersion(i) 判断第i个版本是否错误
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        // 使用二分查找的思路
        int start = 1;
        int end = n;
        int result = start;
        if(!isBadVersion(start)){
            while (start <= end){
                int mid = start + (end-start)/2;
                if(isBadVersion(mid)){
                    if(!isBadVersion(mid-1)){
                        result =  mid;
                        break;
                    }
                    end = mid;
                }else {
                    start = mid + 1;
                }
            }
        }

        return result;
    }

}
