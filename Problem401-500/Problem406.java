import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * 根据身高重建队列
 *
 * @Author RUANWENJUN
 * @Creat 2018-06-12 12:27
 */

public class Problem406 {
    /**
     * 思路：采用插入的方法。
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        if(people.length == 0){
            return people;
        }
        // 排序，按身高递减，人数递增
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0]){
                    return -1;
                }else if(o1[0] < o2[0]){
                    return 1;
                }else if(o1[1] < o2[1]){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        // 排完之后能保证局部有序，然后插入
        LinkedList<int[]> list = new LinkedList<>();
        list.add(people[0]);
        for (int i = 1; i < people.length; i ++){
            if(people[i][0] == people[i-1][0]) {
                list.add(people[i]);
            }else {
                for (int j = i; j < people.length; j ++){
                    // 插入
                    int count = 0;
                    if(count == people[j][1]){
                        list.add(0,people[j]);
                        continue;
                    }
                    for (int k = 0; k < list.size(); k ++){
                        if(list.get(k)[0] >= people[j][0]){
                            count += 1;
                            if(count == people[j][1]){
                                list.add(k+1,people[j]);
                                break;
                            }
                        }
                    }
                }
                break;
            }
        }
        return list.toArray(people);
    }

    public static void main(String[] args) {
        int[][] ints = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        Problem406 p = new Problem406();
        p.reconstructQueue(ints);
    }
}
