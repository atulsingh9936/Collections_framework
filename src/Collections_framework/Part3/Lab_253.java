package Collections_framework.Part3;

import java.util.*;

public class Lab_253 {
    public static void main(String[] args) {
       // Map<String,Integer> map = new WeakHashMap<>();
        //Map<String,Integer> map = new TreeMap<>();
      //  Map<String,Integer> map = new LinkedHashMap<>();
        Map<String,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsValue("id2"));
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));
        System.out.println(map.get("id3"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
