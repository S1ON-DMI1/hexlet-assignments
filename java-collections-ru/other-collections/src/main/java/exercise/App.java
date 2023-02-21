package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> dictionary, Map<String , Object> dictionary2) {

        Map<String, String> result = new LinkedHashMap<>();

        for(Map.Entry<String, Object> entry: dictionary2.entrySet()) {
            String key = entry.getKey();
            if (!dictionary.containsKey(key)) {
                result.put(key, "added");
            }
        }

        for (Map.Entry<String, Object> entry: dictionary.entrySet()) {
            String key = entry.getKey();
            if (!dictionary2.containsKey(key)) {
                result.put(key, "deleted");

            } else if (!entry.getValue().equals(dictionary2.get(key))) {
                result.put(key, "changed");
            }  else {
                result.put(key, "unchanged");
            }
        }
        return result;
    }
}
//END
