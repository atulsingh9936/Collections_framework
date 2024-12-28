package Collections_framework.Part1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab_236 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList();
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("Pramod");
        v.add("Anusha");
        v.add("Kiran");
        v.remove("kiran");
        System.out.println(v);


        List l1 = new LinkedList();
        l1.add("Pramod");
        l1.add("Anusha");
        l1.add("Kiran");

        System.out.println(l1);


    }
}
