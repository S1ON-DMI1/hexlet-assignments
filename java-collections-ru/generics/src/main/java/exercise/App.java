package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
    class App {

        public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> wheres) {
            List<Map<String, String>> result = new ArrayList<>();

            for (Map<String, String> book: books) {
                boolean know = false;

                for (Map.Entry<String, String> wheresXxx: wheres.entrySet()) {
                    if(book.containsKey(wheresXxx.getKey())) {
                        if(book.containsValue(wheresXxx.getValue())) {
                            know = true;

                        } else {
                            know = false;
                            break;
                        }
                    }
                }
                if (know) {
                    result.add(book);
                }
            }
            return result;

        }
}
//END
