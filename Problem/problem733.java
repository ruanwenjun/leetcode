import java.util.logging.Level;

/**
 * 图像渲染
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-05 18:39
 */

public class problem733 {
    // 是否需要染色的标志
    boolean [][] need ;


    /**
     *
     * @param image
     * @param sr
     * @param sc
     * @param newColor
     * @return
     */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        // 是否需要染色的标志
        int length = image.length;
        need = new boolean[length][];
        // 初始化标识数组
        for (int i = 0;i<length;i++){
            need[i] = new boolean[image[i].length];
            for (int j = 0;j<image[i].length;j++){
                need[i][j] = false;
            }
        }
        dfs(image,sr,sc,image[sr][sc]);
        // 进行染色
        for (int i =0;i<length;i++){
            for (int j=0;j<need[i].length;j++){
                if(need[i][j]){
                    image[i][j] = newColor;
                }
            }
        }
        return image;

    }

    /**
     * 深度优先遍历
     */
    public void dfs(int[][] image,  int sr, int sc,int k){
        // 如果当前的像素值等于k，那么递归遍历它周围的
        if(image[sr][sc] == k){
            need[sr][sc] = true;
            //判断周围
            if(sr+1<image.length && !need[sr+1][sc]){
                dfs(image,sr+1,sc,k);
            }
            if(sr-1>=0 && !need[sr-1][sc]){
                dfs(image,sr-1,sc,k);
            }
            if(sc-1>=0 && !need[sr][sc-1]){
                dfs(image,sr,sc-1,k);
            }
            if(sc+1<image[sr].length && !need[sr][sc+1]){
                dfs(image,sr,sc+1,k);
            }
        }
    }
}
