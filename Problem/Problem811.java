import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 子域名访问计数
 *
 * @Author RUANWENJUN
 * @Creat 2018-04-28 19:34
 */

public class Problem811 {
    /**
     * 统计每个域名的访问次数
     * @param cpdomains
     * @return
     */
    public static List<String> subdomainVisits(String[] cpdomains) {

        //使用一个map来保存域名和访问次数
        Map<String,Integer> domain = new HashMap();
        for(String cpdomain : cpdomains){
           //解析域名
            String[] split = cpdomain.split(" ");
            //获取域名次数
            String count = split[0];
            int num = Integer.parseInt(count);
            //获取域名
            String ips = split[1];
            //解析域名
            //记录当前域名
            String index = "";
            String[] split1 = ips.split("\\.");
            for(int i =split1.length -1;i>=0;i--){
                // 域名
                index = split1[i] + index;
                // 将域名次数加入
                Integer v = domain.get(index);
                if(v == null){
                    domain.put(index,num);
                }else{
                    domain.put(index,v + num);
                }
                // 判断当前前面还有没有域名
                if(i>0){
                    index = "." + index;
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry entry : domain.entrySet()){
            String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();
            String result = value + " " + key;
            list.add(result);
        }
        return list;
    }

    public static void main(String[] args) {
        String [] t = new String[]{"9001 discuss.leetcode.com"};
        subdomainVisits(t);
    }
}
