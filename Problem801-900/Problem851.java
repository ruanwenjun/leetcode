import javax.swing.*;
import java.net.HttpRetryException;
import java.util.HashMap;
import java.util.Map;

/**
 * 喧闹和富有
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-10 10:03
 */

public class Problem851 {
    int[] flash ;
    /**
     * 找出比当前有钱的人中 最喧闹的那个
     *
     * @param richer
     * @param quiet
     * @return
     */
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        flash = new int[quiet.length];
        for (int i = 0; i < flash.length; i ++){
            flash[i] = -1;
        }
        int[] result = new int[quiet.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = helper(richer,quiet,i);
        }
        return result;
    }

    /**
     * @param richer
     * @param quiet
     * @param j
     */
    public int helper(int[][] richer, int[] quiet, int j) {
        if(flash[j] != -1){
            return flash[j];
        }
        int result = j;
        for (int i = 0; i < richer.length; i++) {
            if (richer[i][1] == j) {
                int index = 0;
                index = helper(richer, quiet, richer[i][0]);

                if (quiet[index] <= quiet[result]) {
                    result = index;
                }

            }
        }
        flash[j] = result;
        return result;
    }

    public static void main(String[] args) {
        Problem851 p = new Problem851();
        int[][] richer = new int[][]{{0, 2}, {1, 2}};
        int[] quiet = new int[]{0, 1, 2};
        int[] ints = p.loudAndRich(richer, quiet);
        for (int i : ints) {
            System.out.print(i + "-");
        }
    }
}
