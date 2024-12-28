package Collections_framework.Part1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_234 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Dutta");
        System.out.println(" - Print -1");

        for(String str:mylist){
            System.out.println(str);
        }

        System.out.println("-print 2 -");

        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }


        System.out.println("- print 3 -");

        // Iterator
        Iterator<String> itr = mylist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
