import java.util.List;

/**
 * 钥匙和房间
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-27 10:14
 */

public class Problem841 {
    /**
     * 判断能否进入所有房间
     * 每个房间有钥匙能够进入下一个房间
     * @param rooms
     * @return
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // 使用深度优先遍历
        // 房间是否能进的标志
        boolean[] flag = new boolean[rooms.size()];
        dfs(rooms,flag,0);
        for (boolean b : flag){
            if(!b){
                return false;
            }
        }
        return true;
    }

    /**
     * 进行深度遍历
     */
    public void dfs(List<List<Integer>> rooms,boolean[] flag,int start){
        flag[start] = true;
        // 获取当前遍历到的房间钥匙
        for (int y : rooms.get(start)){
            if(!flag[y]){
                dfs(rooms,flag,y);
            }
        }
    }
}
