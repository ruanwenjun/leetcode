import javax.sound.midi.Soundbank;
import java.util.LinkedList;

/**
 * 最大矩形
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-14 21:24
 */

public class Problem85 {

    /**
     * 找出只包含1的最大矩形面积
     * 思路：题目转换成求某个点往下面走全是1的最长的与往右边走全是1最长的相乘最大值
     *
     * @param matrix
     * @return
     */
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int maxSize = 0;
        int[][] width = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            // 首先统计当前层的1的高度
            for (int j = 0; j < matrix[0].length; j++) {
                if (i - 1 >= 0) {
                    // 不是第一层
                    if (matrix[i][j] == '1') {
                        width[i][j] = 1 + width[i - 1][j];
                    } else {
                        width[i][j] = 0;
                    }
                } else {
                    // 是第一层
                    if (matrix[i][j] == '1') {
                        width[i][j] = 1;
                    }
                }
            }
            int indexSize = 0;
            // 栈里面保存的是每一层中的索引，并且索引对应的值按递增排序
            LinkedList<Integer> stack = new LinkedList<>();
            for (int j = 0; j < matrix[0].length; j++) {
                // 栈不为空且不大于栈顶元素
                if (!stack.isEmpty() && width[i][stack.peek()] >= width[i][j]) {
                    // 栈不为空且栈顶元素大于等于当前需要入栈的元素
                    while (!stack.isEmpty() && width[i][stack.peek()] >= width[i][j]) {
                        // 弹出栈定元素，并且计算弹出的扩增面积
                        Integer pop = stack.pop();
                        if(stack.isEmpty()){
                            indexSize = (j - (-1) - 1) * width[i][pop];
                        }else {
                            indexSize = (j - stack.peek() - 1) * width[i][pop];
                        }
                        maxSize = Math.max(maxSize, indexSize);
                    }
                }
                stack.push(j);
            }
            // 全部元素入栈完毕
            int push = matrix[0].length;
            while (!stack.isEmpty()) {
                Integer pop = stack.pop();
                if (stack.peek() == null) {
                    indexSize = (push - (-1) - 1) * width[i][pop];
                } else {
                    indexSize = (push - stack.peek() - 1) * width[i][pop];
                }
                maxSize = Math.max(maxSize, indexSize);
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        Problem85 p = new Problem85();
        char[][] matrix = new char[][]{{'1', '0'}};
        int i = p.maximalRectangle(matrix);
        System.out.println(i);
    }

}
