import javax.sound.midi.MidiChannel;

/**
 * 整数转罗马数字
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-07 18:33
 */

public class Problem12 {
    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 确保输入在1 - 3999之间
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num >0){
            if(num >= 1000){
                sb.append("M");
                num -= 1000;
            }
            if(num >= 900 && num < 1000){
                sb.append("CM");
                num -=900;
            }
            if(num >= 400 && num < 500){
                sb.append("CD");
                num -= 400;
            }
            if(num >= 500 && num < 900){
                sb.append("D");
                num -= 500;
            }
            if(num >= 100 && num < 400){
                sb.append("C");
                num -= 100;
            }
            if(num >=90 && num < 100){
                sb.append("XC");
                num -= 90;
            }
            if(num >= 50 && num < 90){
                sb.append("L");
                num -= 50;
            }
            if(num >= 40 && num < 50){
                sb.append("XL");
                num -= 40;
            }
            if(num >= 10 && num < 40){
                sb.append("X");
                num -= 10;
            }
            if(num >=9 && num < 10){
                sb.append("IX");
                num -= 9;
            }
            if(num >= 5 && num < 9){
                sb.append("V");
                num -= 5;
            }
            if(num >= 4 && num < 5){
                sb.append("IV");
                num -= 4;
            }
            if(num >=1 && num < 4){
                sb.append("I");
                num -= 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Problem12 p = new Problem12();
        String s = p.intToRoman(1000);
        System.out.println(s);
    }
}
