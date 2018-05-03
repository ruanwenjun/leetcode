import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角二
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-02 13:25
 */

public class Problem119 {
    /**
     * 返回杨辉三角的第rowIndex行,从0开始
     *
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();
        if (rowIndex == 0) {
            list.add(1);
            return list;
        }
        // 获得上一行
        List<Integer> lastRow = getRow(rowIndex - 1);
        list.add(1);
        // 添加元素
        for (int j = 0; j < lastRow.size() - 1; j++) {
            list.add(lastRow.get(j) + lastRow.get(j + 1));
        }
        list.add(1);
        return list;
    }

}
