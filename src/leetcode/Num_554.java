package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//哈希表+前缀和
public class Num_554 {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int tmp;
        for(int i = 0; i < wall.size(); i++){
            tmp = 0;
            for(int j = 0; j < wall.get(i).size()-1; j++){
                tmp += wall.get(i).get(j);
                if (map.containsKey(tmp)) map.put(tmp, map.get(tmp)+1);
                else map.put(tmp, 1);
            }
        }
        int key;
        int max_value = 0;
        for(Map.Entry e:map.entrySet()) {
            if ((int)e.getValue() > max_value){
                max_value = (int)e.getValue();
                key = (int)e.getKey();
            }
        }
        return wall.size() - max_value;
    }
}
