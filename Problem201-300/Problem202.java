import java.util.ArrayList;
import java.util.List;

/**
 * 快乐数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-04 13:54
 */

public class Problem202 {
    List<Integer> list = new ArrayList<>();

    /**
     * 每一次将该数变成各个位置的数的平方和，直到变为1
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        // 采用递归来做，如果并记录每一次的数，如果发现在之前就已经出现过这个数了，那么就代表不能
        if (list.contains(n)) {
            return false;
        }
        list.add(n);
        int num = 0;
        String m = n + "";
        for (int i = 0; i < m.length(); i++) {
            String substring = m.substring(i, i + 1);
            int j = Integer.parseInt(substring);
            num +=j*j;
        }
        if(num == 1){
            return true;
        }
        return isHappy(num);
    }

    public static void main(String[] args) {
        Problem202 p = new Problem202();
        p.isHappy(19);
    }
}
