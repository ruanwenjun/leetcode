/**
 * 整数之和
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-29 17:48
 */

public class Problem371 {
    /**
     * 不使用+-计算两个整数之和
     * @param a
     * @param b
     * @return
     */
    public static int getSum(int a, int b) {
        //需要考虑负数的情况
        //判断两个数的正负
        String stringA= "";
        String stringB= "";
        if(a>0){
            stringA = "+" + a ;
        }else{
            stringA = "" + a ;
        }
        if(b>0){
             stringB = "+" + b ;
        }else{
             stringB = "" + b ;
        }

        char[] charsA = stringA.toCharArray();
        char[] charsB = stringB.toCharArray();
        boolean isA = false;
        boolean isB = false;
        if(charsA[0] == '-'){
            isA = true;
        }
        if (charsB[0] == '-') {
            isB = true;
        }
        int max = Integer.max(charsA.length, charsB.length);
        int count = 0;
        int index = 1;
        int lengthA =charsA.length;
        int lengthB = charsB.length;
        //应该是从右往左遍历，遍历的次数为max
        for(int i = 1;i<=max;i++){
            if(lengthA-i > 0){
                if(isA){
                    //A是负数的情况下
                    count -= Integer.parseInt(charsA[lengthA-i]+"")*index;
                }else{
                    count += Integer.parseInt(charsA[lengthA-i]+"")*index;
                }
            }
            if(lengthB-i > 0 ) {
                if(isB){
                    count -= Integer.parseInt(charsB[lengthB-i]+"")*index;
                }else{
                    count += Integer.parseInt(charsB[lengthB-i]+"")*index;
                }
            }
            index *=10;
        }


        return count;
    }

    public static void main(String[] args) {
        int sum = getSum(8, 16);
        System.out.println(sum);
    }
}
