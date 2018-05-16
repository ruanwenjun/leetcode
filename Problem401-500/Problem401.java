import java.util.ArrayList;
import java.util.List;

/**
 * 二进制手表
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-14 18:46
 */

public class Problem401 {
    int[] time = new int[]{8, 4, 2, 1, 32, 16, 8, 4, 2, 1};
    /**
     * 保存情况
     */
    List<String> list = new ArrayList<>();

    /**
     * 小时：8 4 2 1
     * 分钟：32 16 8 4 2 1
     * 输入灯亮的数目，给出时间
     * 小时不能超过11，分钟不能超过59
     *
     * @param num
     * @return
     */
    public List<String> readBinaryWatch(int num) {
        prepare("", 0, num);
        List<String> result = new ArrayList<>();
        // 解析结果
        for (String a : list) {
            boolean add = true;
            int hour = 0;
            int minute = 0;
            for (int i = 0; i < a.length(); i++) {
                if (i <= 3 && a.charAt(i) == '1') {
                    hour += time[i];
                    if (hour >= 12) {
                        add = false;
                        break;
                    }
                }
                if (i > 3 && a.charAt(i) == '1') {
                    minute += time[i];
                    if (minute >= 60) {
                        add = false;
                        break;
                    }
                }
            }

            String now = hour + ":";
            if (minute >= 10) {
                now += minute;
            } else {
                now += "0" + minute;
            }
            if (add) {
                result.add(now);
            }
        }
        return result;
    }

    /**
     * 找出所有可能
     * 1 表示当前灯亮
     * 0 表示当前灯不亮
     * @param a     当前字符串
     * @param index 当前灯是第几个 从0 开始
     * @param num   剩余灯的数目
     */
    public void prepare(String a, int index, int num) {
        if (num == 0) {
            list.add(a);
            return;
        }
        if (10 - index == num) {
            for (int i = 0; i < num; i++) {
                a += "1";
            }
            list.add(a);
            return;
        }
        prepare(a + "1", index + 1, num - 1);
        prepare(a + "0", index + 1, num);
    }

    public static void main(String[] args) {
        Problem401 p = new Problem401();
        List<String> strings = p.readBinaryWatch(2);
        System.out.println(strings);
    }


}
