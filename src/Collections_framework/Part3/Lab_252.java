package Collections_framework.Part3;

import java.util.HashMap;
import java.util.Map;

public class Lab_252 {
    public static void main(String[] args) {
        // map - key value pair
        // Api testing - JSON- Javascript Object Notation - Map
        // JSON- key value pair


        Map<String,Object> studentMap = new HashMap<>();
        studentMap.put("Firstname","Pramod");
        studentMap.put("Age",78);
        studentMap.put("roll",1);
        studentMap.put("course","ATB");
        studentMap.put("lastname","dutta");
        studentMap.put("isMale",true);
        System.out.println(studentMap);
        System.out.println(studentMap.get("Firstname"));
        System.out.println(studentMap.get("Age"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsKey("Age"));
        System.out.println(studentMap.containsValue(78));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());


        for(Map.Entry<String,Object> item: studentMap.entrySet()){
            System.out.println(item.getKey()+" : "+ item.getValue());
        }

    }
}
