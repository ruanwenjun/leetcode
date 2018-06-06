import java.util.ArrayList;
import java.util.List;

/**
 * 所有从源点到目标点的路径
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-05 13:12
 */

public class Problem797 {
    List<List<Integer>> result = new ArrayList<>();
    /**
     * 输出所有从0到N - 1 的路径
     * [[1,2],[3],[3]]
     * [0,1,3] , [0,2,3]
     * @param graph
     * @return
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 思路：使用DFS来做,遍历每一条路经，假设不存在回路
        Dfs(graph,0,new ArrayList<>());
        return result;
    }

    /**
     *
     * @param graph
     * @param index 当前的节点索引
     * @param path 当前走过的路径
     */
    public void Dfs(int[][] graph,int index,List<Integer> path){
        if(index >= graph.length){
            return;
        }
        for (int i = 0; i < graph[index].length; i++){
            path.add(index);
             // 当前已经到达
            if(graph[index][i] == graph.length - 1){
                List<Integer> list = new ArrayList<>(path);
                list.add(graph[index][i]);
                result.add(list);
            }else {
                Dfs(graph,graph[index][i],path);
            }
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        Problem797 p = new Problem797();
        int [][] a = new int[][]{{1,2}, {3}, {3}, {}};
        List<List<Integer>> list = p.allPathsSourceTarget(a);
        System.out.println(list);
    }
}
