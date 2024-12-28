package Collections_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab_235 {
    public static void main(String[] args) {
        ArrayList mylist1 = new ArrayList();
        List mylist = new ArrayList();
        SequencedCollection mylist2 = new ArrayList();
        Collection mylist3 = new ArrayList();

        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        System.out.println(mylist);


        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add(null);
        mylist.add(null);
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Pramod");
        System.out.println(mylist);
    }
}
