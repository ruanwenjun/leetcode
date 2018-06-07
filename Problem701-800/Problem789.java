/**
 * 逃脱阻碍着
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-06 12:46
 */

public class Problem789 {
    /**
     * 走到target,能否不被阻碍者抓住
     * @param ghosts
     * @param target
     * @return
     */
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        // 思路：如果能在阻碍者之前走到target即可
        if(target.length <2){
            return false;
        }
        if(ghosts.length < 1){
            return true;
        }
        int targetX = target[0];
        int targetY = target[1];
        // 幸存者走到target的步数
        int count = Math.abs(targetX) + Math.abs(targetY);
        // 找出阻碍者走到target的步数
        for (int i = 0; i < ghosts.length; i ++){
            int index = Math.abs(ghosts[i][0] - targetX) + Math.abs(ghosts[i][1] - targetY);
            if(index <= count){
                return false;
            }
        }
        return true;
    }
}
