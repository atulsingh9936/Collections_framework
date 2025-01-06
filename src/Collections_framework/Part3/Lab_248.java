package Collections_framework.Part3;

import java.util.TreeSet;

public class Lab_248 {
    public static void main(String[] args) {
//        TreeSet numset = new TreeSet();
//        numset.add(50);
//        numset.add(20);
//        numset.add(10);
//        System.out.println(numset);

        TreeSet numset = new TreeSet();
        numset.add(50);
        numset.add(20);
        numset.add(10);
        numset.add("Pramod"); //java.lang.ClassCastException
        System.out.println(numset);

    }
}
