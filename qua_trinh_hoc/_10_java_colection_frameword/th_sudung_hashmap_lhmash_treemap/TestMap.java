package _10_java_colection_frameword.th_sudung_hashmap_lhmash_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("smith",30);
        hashMap.put("aderson",31);
        hashMap.put("lewis",29);
        hashMap.put("cook",29);
        System.out.println(hashMap);
        Map<String,Integer> treMap = new TreeMap<>();
        treMap.put("smith",30);
        treMap.put("aderson",31);
        treMap.put("lewis",29);
       treMap.put("cook",29);
        System.out.println(treMap);
        Map<String,Integer> linkedHashMap  = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("Lewis"));
    }

    
}
