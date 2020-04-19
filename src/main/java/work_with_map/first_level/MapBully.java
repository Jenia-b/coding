package work_with_map.first_level;

import java.util.Map;

public class MapBully {
    static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }
        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }
        return map;
    }
}
