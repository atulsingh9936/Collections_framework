package Collections_framework.Part3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_249 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);


        Set<Integer> integerSet1 = new LinkedHashSet<>();
        integerSet1.add(123456);
        integerSet1.add(12345);
        integerSet1.add(1234);
        integerSet1.add(123);
        integerSet1.add(12);
        integerSet1.add(null);
        System.out.println(integerSet1);


        Set<Integer> integerSet2 = new TreeSet<>();
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(123);
        integerSet2.add(12);
      //  integerSet2.add(null);
        System.out.println(integerSet2);


        Set<Integer> integerSet3 = new TreeSet<>();
        integerSet3.add(11);
        integerSet3.add(8);
        System.out.println(integerSet3);

        Set integerSet4 = new TreeSet<>();
        integerSet4.add("Pramod");
        integerSet4.add("Dutta");
        System.out.println(integerSet4);
    }
}
