package Collections_framework.Part3;

import java.util.HashSet;
import java.util.Set;

public class Lab_245 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        // How hashset works
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Water melon");
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Water melon");
        System.out.println(fruits);

    }
}
