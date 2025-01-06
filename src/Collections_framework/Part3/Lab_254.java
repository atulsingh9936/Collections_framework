package Collections_framework.Part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lab_254 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Firstname","Pramod");
        map.put("Lastname","pawar");
        map.put("email","atul.singh289@gmail.com");
        map.put("phonenumber","988787878");
        map.put("city","Pune");
        map.put("state","MH");
        map.put("country","India");
        map.put("zip","411057");
       // System.out.println(map);




        Map<String,String> map2 = new HashMap<>();
        map2.put("Firstname","Pramod");
        map2.put("Lastname","pawar");
        map2.put("email","atul.singh289@gmail.com");
        map2.put("phonenumber","988787878");
        map2.put("city","Pune");
        map2.put("state","MH");
        map2.put("country","India");
        map2.put("zip","411057");
       // System.out.println(map2);


        ArrayList list = new ArrayList();
        list.add(map);
        list.add(map2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
