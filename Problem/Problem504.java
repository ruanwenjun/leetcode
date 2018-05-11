/**
 * 七进制数
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-10 17:20
 */

public class Problem504 {
    /**
     * 将整数转化为七进制数
     *
     * @param num
     * @return
     */
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int index = Math.abs(num);
        while (index != 0) {
            int i = index % 7;
            sb.append(i);
            index = index/7;
        }
        String reverse = sb.reverse().toString();
        if(num<0){
            reverse = "-" + reverse;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Problem504 p = new Problem504();
        System.out.println(p.convertToBase7(0));
    }
}
