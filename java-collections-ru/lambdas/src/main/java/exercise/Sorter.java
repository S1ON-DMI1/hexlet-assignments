package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public static List<String> takeOldestMans(List<Map<String, String>> name){

         return name.stream()
        .filter(gen -> gen.get("gender").equals("male"))
        .sorted(Comparator.comparating(x -> x.get("birthday")))
        .map(x -> x.get("name"))
        .collect(Collectors.toList());


        }
// END
