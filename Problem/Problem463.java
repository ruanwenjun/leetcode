/**
 * 计算岛屿的周长
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-27 22:21
 */

public class Problem463 {
    /**
     * 二维数组中 1代表是陆地，0代表是水
     * @param grid
     * @return
     */
    public static int islandPerimeter(int[][] grid) {
        //遍历二维数组，如果是陆地那么+4，然后判断他的上左是否存在1，若存在，则需要减1
        // 高度
        int hight = grid.length;
        //宽度
        int width = 0;
        if(hight >0 ){
            width = grid[0].length;
        }
        //周长
        int length = 0;
        //遍历二维数组
        for (int i = 0; i < hight; i++) {
            for(int j =0; j < width; j++) {
                if(grid[i][j] == 1) {
                    //判断它的上左
                    if( i == 0 || grid[i-1][j] != 1) {
                        length ++;
                    }else {
                        length --;
                    }

                    if( j ==0 || grid[i][j-1] != 1) {
                        length ++;
                    }else {
                        length --;
                    }
                    length +=2;
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int [][] num = new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(islandPerimeter(num));
    }
}
