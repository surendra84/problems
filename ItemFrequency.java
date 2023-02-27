// Program to return the frequency of the items provided in the list

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
class ItemFrequency {
    public static void main(String[] args) {
        
        List<String> itemList = List.of("item1", "item1", "item2","item3","item2","item5","item1","item5");
        Map<String,Long> map = itemList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Item map with frequency::");
        System.out.println(map);
      
        List<String> top = map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(2).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("Top two items from the map::");
        System.out.println(top);
        
        // Reverse map
        Map<String, Long> revMap = map.entrySet()
        .stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,  (k,v)->k,LinkedHashMap::new));
        System.out.println("Item a reverse map with frequency::");
        System.out.println(revMap); 
    }
}
