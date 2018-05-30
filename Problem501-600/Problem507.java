import java.util.NavigableMap;

/**
 * 完美数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-29 12:32
 */

public class Problem507 {
    /**
     * 暴力遍历
     * @param num
     * @return
     */
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int count = 1;
        int index = (int) Math.sqrt(num);
        for (int i =2;i<=index;i++){
            if(num % i == 0){
                count = count + i + num/i;
            }
        }
        return num == count;
    }

    public static void main(String[] args) {
        Problem507 p = new Problem507();
        boolean b = p.checkPerfectNumber(1);
        System.out.println(b);
    }
}
