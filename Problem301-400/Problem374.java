/**
 * 猜数字大小
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-24 16:25
 */

public class Problem374 {
    /**
     * 我从1到N选择一个数，你需要猜我选择了哪个数
     * @param n
     * @return
     */
    public int guessNumber(int n) {

        return g(1,n);
    }
    public int g(int start,int end){
        int index = start + (end-start)/2;
        int compare = guess(index);
        if(compare == 0){
            return index;
        }
        if(compare>0){
            return g(index + 1,end);
        }
        return g(1,index - 1);
    }
    public int guess(int i ){
        if(i>1){
            return -1;
        }
        if(i < 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Problem374 p = new Problem374();
        int i = p.guessNumber(1);
        System.out.println(i);

    }
}
