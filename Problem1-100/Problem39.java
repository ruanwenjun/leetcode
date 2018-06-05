import javafx.scene.Camera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合总和
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-04 21:20
 */

public class Problem39 {
    List<List<Integer>> result = new ArrayList<>();

    /**
     * 找到总和为target的组合，每个数可以被重复选取，但是组合不能重复
     * 思路：采用分冶法
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length <= 0 || target <=0){
            return result;
        }
        find(candidates,new ArrayList<>(),0,target);
        return result;
    }

    /**
     * 从索引为index位置开始找到和为target的组合
     *
     * @param candidates
     * @param target
     * @return
     */
    public void find(int[] candidates, List<Integer> list,int start, int target) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(list);
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                List<Integer> index = new ArrayList<>(list);
                index.add(candidates[i]);
                find(candidates,index,i,target-candidates[i]);
            }
        }

    }

    public static void main(String[] args) {
        Problem39 p = new Problem39();
        int[] a = new int[]{2,3,6,7};
        List<List<Integer>> list = p.combinationSum(a, 7);
        System.out.println(list);
    }

}
