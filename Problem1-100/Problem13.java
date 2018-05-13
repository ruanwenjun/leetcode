/**
 * 罗马数字转整数
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-27 11:35
 */

public class Problem13 {
    /**
     * 给定一个罗马数字，将其转换为整数类型
     * I1 V5 X10 L50 C100 D500 M1000
     * I可以放在V,X左边
     * X可以放在L ，C左边
     * C可以放在D，M左边
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        //将字符串解析为数组
        char[] chars = s.toCharArray();
        //遍历
        int count = 0;
        int length = chars.length;
        //遍历
        for (int i = 0; i < length; i++) {
            switch (chars[i]) {
                case 'I':
                    //判断右边是否为V,X
                    if (i < length - 1 && (chars[i + 1] == 'V' || chars[i + 1] == 'X')) {
                        count--;
                    } else {
                        count += 1;
                    }
                    break;
                case 'V':
                    count += 5;
                    break;
                case 'X':
                    //判断右边是否为L,C
                    if (i < length - 1 && (chars[i + 1] == 'L' || chars[i + 1] == 'C')) {
                        count = count - 10;
                    } else {
                        count += 10;
                    }
                    break;
                case 'L':
                    count += 50;
                    break;
                case 'C':
                    //判断右边是否为D,M
                    if (i < length - 1 && (chars[i + 1] == 'D' || chars[i + 1] == 'M')) {
                        count = count - 100;
                    } else {
                        count += 100;
                    }
                    break;
                case 'D':
                    count += 500;
                    break;
                case 'M':
                    count += 1000;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}
