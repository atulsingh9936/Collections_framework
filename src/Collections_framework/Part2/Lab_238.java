package Collections_framework.Part2;

import java.util.ArrayList;
import java.util.List;

public class Lab_238 {
    public static void main(String[] args) {

        // List - Arraylist, Linked list, Vector, stack
        // set -Hashset,LinkedHashSet,Treeset
        // Map - Hashmap,LinkedHashmap,Treemap
        // queue - priorityqueue, Linkedlist
        // Hashtable properties

        List<String> courselist = new ArrayList<>();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("Pyatb");
        courselist.add("Lapib");
        courselist.add("sdet blueprint");


        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courselist.addAll(numList);
        System.out.println(courselist);

    }
}
