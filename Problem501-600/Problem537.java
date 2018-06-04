/**
 * 复数乘法
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-03 18:17
 */

public class Problem537 {
    /**
     * 1 + 1i
     * 1 + 1i
     * 返回 0 + 2i
     *
     * @param a
     * @param b
     * @return
     */
    public String complexNumberMultiply(String a, String b) {
        // 首先按 + 分割
        String[] splitA = a.split("\\+");
        String[] splitB = b.split("\\+");
        // 分别得到整数部分 和 复数因子
        Integer firstA = Integer.parseInt(splitA[0]);
        Integer firstB = Integer.parseInt(splitB[0]);
        Integer secondA;
        if (splitA[1].startsWith("-")) {
            secondA = -1 * Integer.parseInt(splitA[1].substring(1, splitA[1].length() - 1));
        } else {
            secondA = Integer.parseInt(splitA[1].substring(0, splitA[1].length() - 1));
        }
        Integer secondB;
        if (splitB[1].startsWith("-")) {
            secondB = -1 * Integer.parseInt(splitB[1].substring(1, splitB[1].length() - 1));
        } else {
            secondB = Integer.parseInt(splitB[1].substring(0, splitB[1].length() - 1));

        }

        StringBuilder sb = new StringBuilder();
        sb.append(firstA * firstB - secondA * secondB);
        sb.append("+");
        sb.append(firstA * secondB + firstB * secondA);
        sb.append("i");
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem537 p = new Problem537();
        String s = p.complexNumberMultiply("1+-1i", "1+-1i");
        System.out.println(s);
    }
}
