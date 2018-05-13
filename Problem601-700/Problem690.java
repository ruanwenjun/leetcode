import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 员工的重要性
 *
 * @Author RUANWENJUN
 * @Creat 2018-05-03 13:08
 */

public class Problem690 {

    public class Employee{
        // 员工ID
        public int id;
        // 员工重要度
        public int importance;
        // 直系下属ID
        public List<Integer> subordinates;
    }

    /**
     * 求员工和他的所有下属的重要度之和
     * @param employees
     * @param id
     * @return
     */
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
        init(employees,map);
        // 使用一个栈表来保存所有的下属ID
        LinkedList<Integer> list = new LinkedList<>();
        int importance = 0;
        // 根据ID获得员工

        Employee employee = map.get(id);
        // 员工进栈
        list.push(employee.id);
        // 栈不为空
        while (!list.isEmpty()){
            Integer pop = list.pop();
            // 当前员工
            Employee index = map.get(pop);
            importance += index.importance;
            List<Integer> subordinates = index.subordinates;
            // 下属ID进栈
            for(int i : subordinates){
                list.push(i);
            }
        }
        return importance;
    }

    /**
     * 将表映射到hashmap中
     * @param employees
     * @param map
     */
    public void init(List<Employee> employees, HashMap<Integer,Employee> map){
        for (Employee employee : employees){
            map.put(employee.id,employee);
        }
    }
}
