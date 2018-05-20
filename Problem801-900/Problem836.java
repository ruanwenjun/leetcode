/**
 * 矩形重叠
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-20 9:33
 */

public class Problem836 {
    /**
     * 判断两个矩形是否重叠
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // 判断边
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];
        int x11 = rec2[0];
        int y11 = rec2[1];
        int x22 = rec2[2];
        int y22 = rec2[3];

        if((y11>=y1&&y11<y2)||(y22<=y2&&y22>y1)){
            if(x11<x2&&x22>x1){
                return true;
            }
            return false;
        }
        if((x11>=x1&&x11<x2)||(x22<=x2&&x22>x1)){
            if(y11<y2&&y22>y1){
                return true;
            }
            return false;
        }
        if(x11<=x1&&x22>=x2&&y11<=y1&&y22>=y2){
            return true;
        }
        if(x11>=x1&&x22<=x2&&y11>=y1&&y22<=y2){
            return true;
        }

        return false;
    }
}
