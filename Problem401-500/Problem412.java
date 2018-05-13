import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-30 12:10
 */

public class Problem412 {
    /**
     * 输出数字1到n的字符串表示形式
     * 如果能被3整除 Fizz
     * 能被5整除 Buzz
     * 同时被3 5 整除 FizzBuzz
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if(i % 3 ==0 && i % 5 == 0){
                list.add("FizzBuzz");
            }else if(i % 3 ==0){
                list.add("Fizz");
            }else if(i % 5 ==0){
                list.add("Buzz");
            }else{
                list.add("" + i);
            }
        }
        return  list;
    }
}
