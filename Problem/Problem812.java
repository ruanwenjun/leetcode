import jdk.nashorn.api.tree.NewTree;

/**
 * 最大三角形面积
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-06 12:52
 */

public class Problem812 {
    /**
     * 找出横纵坐标最大最小的点
     * @param points
     * @return
     */
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        //  采用暴力方法
        // 从第一个点往后遍历
        int len = points.length;
        for (int i = 0;i<len;i++){
            // 第一个点是
            double firstX = points[i][0];
            double firstY = points[i][1];
            for (int j=i+1;j<len;j++){
                //
                double secondX = points[j][0];
                double secondY = points[j][1];
                double a = Math.sqrt((firstX-secondX)*(firstX-secondX) + (firstY-secondY)*(firstY-secondY));
                for (int k = j+1;k<len;k++){
                    double thirdX = points[k][0];
                    double thirdY = points[k][1];
                    double b = Math.sqrt((firstX-thirdX)*(firstX-thirdX) + (firstY-thirdY)*(firstY-thirdY));
                    double c = Math.sqrt((secondX-thirdX)*(secondX-thirdX) + (secondY-thirdY)*(secondY-thirdY));
                    // 求面积 1/4）√[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
                    double index = Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4;
                    if(index>max){
                        max = index;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Problem812 p = new Problem812();
        int [][] a= new int[][]{{4,6},{6,5},{3,1}};
        p.largestTriangleArea(a);
    }
}
